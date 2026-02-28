package com.fiap.ec.backend_consultas.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fiap.ec.backend_consultas.model.Especialidade;
import com.fiap.ec.backend_consultas.repository.EspecialidadeRepository;
@Service
public class EspecialidadeService {
    private final EspecialidadeRepository repository;
    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }
    public Especialidade salvar(Especialidade especialidade) {
        return repository.save(especialidade);
    }
    public List<Especialidade> listar() {
        return repository.findAll();
    }
}