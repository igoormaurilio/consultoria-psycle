import React from 'react';

function Hero() {
  return (
    <section className="container my-5 d-flex flex-column flex-md-row align-items-center justify-content-between" id="sobre">
      <div className="col-md-6 mb-4">
        <h2 className="fw-bold">Clinica Psycle</h2>
        <p>
          Cuidar da mente é essencial para uma vida equilibrada e saudável. Na Clinica Psycle, oferecemos atendimento psiquiátrico humanizado e individualizado, com foco no bem-estar emocional e na qualidade de vida dos nossos pacientes.
        </p>
        <p>
          Realizamos acompanhamento em transtornos como ansiedade, depressão, bipolaridade, TDAH, entre outros, sempre com empatia, sigilo e responsabilidade. Agende sua consulta e dê o primeiro passo para cuidar de você.
        </p>
      </div>
      <div className="col-md-5 text-center">
        <img src="public/img/download-removebg-preview 1.png" alt="Ilustração" className="img-fluid rounded shadow" />
      </div>
    </section>
  );
}

export default Hero;
