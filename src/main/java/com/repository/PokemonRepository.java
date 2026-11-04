package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    
}
