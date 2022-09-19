package com.avirup.petclinicdata.services;

import com.avirup.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
