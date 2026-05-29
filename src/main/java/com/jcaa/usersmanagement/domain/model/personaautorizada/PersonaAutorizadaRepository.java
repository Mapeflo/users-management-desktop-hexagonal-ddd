package com.jcaa.usersmanagement.domain.model.personaautorizada;

import java.util.List;
import java.util.Optional;

public interface PersonaAutorizadaRepository {

    PersonaAutorizada save(PersonaAutorizada personaAutorizada);

    Optional<PersonaAutorizada> findById(Long id);

    Optional<PersonaAutorizada> findByDni(String dni);

    List<PersonaAutorizada> findAll();

    List<PersonaAutorizada> findByNinoId(Long ninoId);   // Caso de uso adicional

    void delete(Long id);

    boolean existsByDni(String dni);
}