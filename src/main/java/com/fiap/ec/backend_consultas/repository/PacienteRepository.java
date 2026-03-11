package com.fiap.ec.backend_consultas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.ec.backend_consultas.model.Paciente;
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}