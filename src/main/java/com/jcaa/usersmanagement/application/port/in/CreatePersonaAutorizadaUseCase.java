package com.jcaa.usersmanagement.application.port.in;

import com.jcaa.usersmanagement.application.service.personaautorizada.command.CreatePersonaAutorizadaCommand;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;

public interface CreatePersonaAutorizadaUseCase {

    PersonaAutorizadaResponse execute(CreatePersonaAutorizadaCommand command);
}
