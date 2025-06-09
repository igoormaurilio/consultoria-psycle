import React from 'react';

function Header({ onToggleDarkMode, isDark }) {
  return (
    <nav className={`navbar navbar-expand-lg ${isDark ? 'navbar-dark bg-dark' : 'navbar-light bg-primary'} text-white px-4`}>
      <a className="navbar-brand text-white fw-bold" href="#">
        <img src="public/img/istockphoto-1468510705-640x640-removebg-preview 1.png" alt="Logo" style={{ width: '30px', marginRight: '10px' }} />
        Clinica Psycle
      </a>
      <div className="collapse navbar-collapse justify-content-end">
        <ul className="navbar-nav">
          <li className="nav-item mx-2"><a className="nav-link text-white" href="#sobre">Sobre Nós</a></li>
          <li className="nav-item mx-2"><a className="nav-link text-white" href="#medico">Médico</a></li>
          <li className="nav-item mx-2"><a className="nav-link text-white" href="#contato">Contato</a></li>
          <li className="nav-item mx-2"><a className="btn btn-outline-light" href="#agendamento">Agendar Consulta</a></li>
          <li className="nav-item mx-2">
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default Header;

