package com.jcaa.usersmanagement.application.port.out;

import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import java.util.List;

public interface ListPersonaAutorizadaPort {

    List<PersonaAutorizada> findAll();
}
