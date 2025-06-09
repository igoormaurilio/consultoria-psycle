import React from 'react';
import { Link } from 'react-router-dom';

function AdminMenu() {
  return (
    <div className="container mt-5">
      <h2>Menu do Administrador</h2>
      <ul className="list-group mt-4">
        <li className="list-group-item">
          <Link to="/cadastro">Cadastrar Novo Administrador</Link>
        </li>
        <li className="list-group-item">
          <Link to="/">Voltar ao Site</Link>
        </li>
      </ul>
    </div>
  );
}

export default AdminMenu;
