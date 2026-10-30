package com.example.resourcehub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resourcehub.models.Recurso;
import com.example.resourcehub.repository.RecursoRepository;

@Service 
public class RecursoService {
    
    @Autowired
    RecursoRepository recursoRepository;

    public List<Recurso> obtenerTodos() {
        return recursoRepository.findAll();
    }

    public Optional<Recurso> obtenerPorId(Long id) {
        return recursoRepository.findById(id);
    }

    public Recurso crearRecurso(Recurso recurso) {
        //Aqui podrian agregar alguna validacion de negocio
        return recursoRepository.save(recurso);
    }

    //PUT -> actualicen el objeto completo
    //PATCH -> actualicen parcial

    public Optional<Recurso> actualizarCompleto(Long id, Recurso recursoActualizado) {
        return recursoRepository.findById(id).map(recursoExistente -> {
            //PUT actualiza el objeto completo
            recursoExistente.setTitulo(recursoActualizado.getTitulo());
            recursoExistente.setUrl(recursoActualizado.getUrl());
            recursoExistente.setTipo(recursoActualizado.getTipo());
            recursoExistente.setCategoria(recursoActualizado.getCategoria());
            return recursoRepository.save(recursoExistente);
        });
    }

    public Optional<Recurso> actualizarParcial(Long id, Recurso recursoActualizado) {
        return recursoRepository.findById(id).map(recursoExistente -> {
            //PATCH solo actualiza los campos que no vienen nulos
            if (recursoActualizado.getTitulo() != null) {
                recursoExistente.setTitulo(recursoActualizado.getTitulo());
            }
            if (recursoActualizado.getUrl() != null) {
                recursoExistente.setUrl(recursoActualizado.getUrl());
            }
            if (recursoActualizado.getTipo() != null) {
                recursoExistente.setTipo(recursoActualizado.getTipo());
            }
            if (recursoActualizado.getCategoria() != null) {
                recursoExistente.setCategoria(recursoActualizado.getCategoria());
            }
            return recursoRepository.save(recursoExistente);
        });
    }

    public boolean eliminarRecurso(Long id) {
        return recursoRepository.deleteById(id);
    }

}
