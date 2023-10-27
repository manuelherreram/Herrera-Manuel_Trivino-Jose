package com.backend.service;

import com.backend.dao.IDao;
import com.backend.model.Paciente;

import java.util.List;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente registrarPaciente(Paciente paciente) {
        return pacienteIDao.registrar(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteIDao.listarTodos();
    }


}
