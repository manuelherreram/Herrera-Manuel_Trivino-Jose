package com.backend.dao.impl;

import com.backend.dao.IDao;
import com.backend.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoMemoria implements IDao<Odontologo> {
    private final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);

    private List<Odontologo> odontologoListado;

    public OdontologoDaoMemoria(List<Odontologo> odontologoListado) {
        this.odontologoListado = odontologoListado;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        int id = odontologoListado.size() + 1;
        odontologoListado.add(odontologo);
        Odontologo odontologoRegistrado = new Odontologo(id, odontologo.getMatricula(), odontologo.getNombre(), odontologo.getApellido());
        LOGGER.info("Odontologo Registrado: " + odontologoRegistrado);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return odontologoListado;
    }

    @Override
    public Odontologo buscarPorId(int id) {
        return null;
    }


}
