package com.example.resourcehub.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.resourcehub.models.Recurso;

@Repository 
public class RecursoRepository {
     
    private final List<Recurso> recursos = new ArrayList<>();
    private Long contadorId = 1L;

    public List<Recurso> findAll() {
        return new ArrayList<>(recursos);
    }

    public Optional<Recurso> findById(Long id) {
        return recursos.stream()
                .filter(recurso -> recurso.getId().equals(id))
                .findFirst();
    }

    public Recurso save(Recurso recurso) {
        if (recurso.getId() == null) {
            // Es una cracion (POST) 
            recurso.setId(contadorId++);
            recursos.add(recurso);   
        } else {
            int index = -1;
            for (int i = 0; i < recursos.size(); i++) {
                if (recursos.get(i).getId().equals(recurso.getId())) {
                    index = i;
                    break;
                }
            }
        }
        return recurso;
    }

    public boolean deleteById(Long id) {
        return recursos.removeIf(recurso -> recurso.getId().equals(id));
    }

}
