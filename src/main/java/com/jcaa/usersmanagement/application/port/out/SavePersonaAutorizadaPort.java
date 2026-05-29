package com.jcaa.usersmanagement.application.port.out;

import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;

public interface SavePersonaAutorizadaPort {

    PersonaAutorizada save(PersonaAutorizada personaAutorizada);
}