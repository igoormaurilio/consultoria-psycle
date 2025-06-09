import React from 'react';

function Diferenciais() {
  return (
    <section className="bg-light py-5">
      <div className="container text-center">
        <h3 className="fw-bold mb-4">Nossos Diferenciais</h3>
        <div className="row">
          {[
            {
              icon: 'bi-people-fill',
              title: 'Atendimento Humanizado',
              text: 'Priorizamos uma escuta atenta e acolhedora, respeitando a individualidade de cada paciente.',
            },
            {
              icon: 'bi-award-fill',
              title: 'Profissionais Qualificados',
              text: 'Nossa equipe é formada por psiquiatras experientes e dedicados ao seu bem-estar.',
            },
            {
              icon: 'bi-shield-lock-fill',
              title: 'Sigilo e Confidencialidade',
              text: 'Garantimos um ambiente seguro e discreto para o seu tratamento.',
            },
          ].map((item, i) => (
            <div className="col-md-4 mb-4" key={i}>
              <div className="p-4 bg-white rounded shadow-sm h-100">
                <i className={`bi ${item.icon} fs-2 text-primary mb-3`}></i>
                <h5 className="fw-bold">{item.title}</h5>
                <p>{item.text}</p>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
}

export default Diferenciais;