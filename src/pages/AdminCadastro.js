import React, { useState } from 'react';

function AdminCadastro() {
  const [admin, setAdmin] = useState({ nome: '', email: '', senha: '' });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setAdmin({ ...admin, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    let adminsSalvos = JSON.parse(localStorage.getItem('admins') || '[]');
    adminsSalvos.push(admin);
    localStorage.setItem('admins', JSON.stringify(adminsSalvos));
    alert('Administrador cadastrado com sucesso!');
    setAdmin({ nome: '', email: '', senha: '' });
  };

  return (
    <div className="container mt-5">
      <h2>Cadastrar Novo Administrador</h2>
      <form onSubmit={handleSubmit} style={{ maxWidth: '500px' }}>
        <div className="mb-3">
          <label className="form-label">Nome</label>
          <input type="text" name="nome" value={admin.nome} onChange={handleChange} className="form-control" required />
        </div>
        <div className="mb-3">
          <label className="form-label">Email</label>
          <input type="email" name="email" value={admin.email} onChange={handleChange} className="form-control" required />
        </div>
        <div className="mb-3">
          <label className="form-label">Senha</label>
          <input type="password" name="senha" value={admin.senha} onChange={handleChange} className="form-control" required />
        </div>
        <button type="submit" className="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  );
}

export default AdminCadastro;
