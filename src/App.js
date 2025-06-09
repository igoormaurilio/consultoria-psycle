import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/Header';
import Hero from './components/Hero';
import Diferenciais from './components/Diferenciais';
import Agendamento from './components/Agendamento';
import CallToAction from './components/CallToAction';
import Footer from './components/Footer';
import AdminMenu from './pages/AdminMenu';
import AdminCadastro from './pages/AdminCadastro';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import './App.css';

function App() {
  return (
    <Router>
      <Routes>
        <Route
          path="/"
          element={
            <div className="bg-white text-dark">
              <Header />
              <Hero />
              <Diferenciais />
              <Agendamento />
              <CallToAction />
              <Footer />
            </div>
          }
        />
        <Route path="/admin" element={<AdminMenu />} />
        <Route path="/cadastro" element={<AdminCadastro />} />
      </Routes>
    </Router>
  );
}

export default App;
