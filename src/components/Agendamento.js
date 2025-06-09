import React, { useState, useEffect } from 'react';

function Agendamento() {
  const [formData, setFormData] = useState({
    nome: '',
    email: '',
    data: '',
    mensagem: '',
  });

  const [agendamentos, setAgendamentos] = useState([]);

  useEffect(() => {
    const dadosSalvos = localStorage.getItem('agendamentos');
    if (dadosSalvos) {
      setAgendamentos(JSON.parse(dadosSalvos));
    }
  }, []);

  useEffect(() => {
    localStorage.setItem('agendamentos', JSON.stringify(agendamentos));
  }, [agendamentos]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({ ...prev, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setAgendamentos([...agendamentos, formData]);
    alert("Consulta agendada com sucesso!");
    setFormData({ nome: '', email: '', data: '', mensagem: '' });
  };

  return (
    <section id="agendamento" className="container my-5">
      <h3 className="text-center fw-bold mb-4">Agende sua Consulta</h3>
      <form onSubmit={handleSubmit} className="mx-auto" style={{ maxWidth: '600px' }}>
        <div className="mb-3">
          <label className="form-label">Nome</label>
          <input type="text" className="form-control" name="nome" value={formData.nome} onChange={handleChange} required />
        </div>
        <div className="mb-3">
          <label className="form-label">Email</label>
          <input type="email" className="form-control" name="email" value={formData.email} onChange={handleChange} required />
        </div>
        <div className="mb-3">
          <label className="form-label">Data da Consulta</label>
          <input type="date" className="form-control" name="data" value={formData.data} onChange={handleChange} required />
        </div>
        <div className="mb-3">
          <label className="form-label">Mensagem (opcional)</label>
          <textarea className="form-control" name="mensagem" rows="3" value={formData.mensagem} onChange={handleChange} />
        </div>
        <button type="submit" className="btn btn-primary w-100">Agendar</button>
      </form>
    </section>
  );
}

export default Agendamento;
