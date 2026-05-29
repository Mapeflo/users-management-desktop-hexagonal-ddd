package com.jcaa.usersmanagement.application.service.personaautorizada;

import com.jcaa.usersmanagement.application.port.in.ListPersonaAutorizadaUseCase;
import com.jcaa.usersmanagement.application.port.out.ListPersonaAutorizadaPort;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ListPersonaAutorizadaService implements ListPersonaAutorizadaUseCase {

    private final ListPersonaAutorizadaPort listPersonaAutorizadaPort;

    @Override
    public List<PersonaAutorizadaResponse> execute() {
        return listPersonaAutorizadaPort.findAll()
                .stream()
                .map(PersonaAutorizadaResponse::new)
                .collect(Collectors.toList());
    }

}
