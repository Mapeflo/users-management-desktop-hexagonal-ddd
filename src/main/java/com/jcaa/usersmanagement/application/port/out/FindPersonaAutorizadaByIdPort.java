package com.jcaa.usersmanagement.application.port.out;

import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import java.util.Optional;

public interface FindPersonaAutorizadaByIdPort {

    Optional<PersonaAutorizada> findById(Long id);
}
