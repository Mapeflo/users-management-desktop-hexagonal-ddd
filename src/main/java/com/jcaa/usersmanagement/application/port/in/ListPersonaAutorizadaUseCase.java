package com.jcaa.usersmanagement.application.port.in;

import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import java.util.List;

public interface ListPersonaAutorizadaUseCase {

    List<PersonaAutorizadaResponse> execute();
}