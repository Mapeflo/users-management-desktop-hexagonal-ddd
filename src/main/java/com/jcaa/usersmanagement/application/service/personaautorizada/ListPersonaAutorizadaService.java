package com.jcaa.usersmanagement.application.service.personaautorizada;

import com.jcaa.usersmanagement.application.port.in.ListPersonaAutorizadaUseCase;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizadaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ListPersonaAutorizadaService implements ListPersonaAutorizadaUseCase {

    private final PersonaAutorizadaRepository personaAutorizadaRepository;

    @Override
    public List<PersonaAutorizadaResponse> execute() {
        return personaAutorizadaRepository.findAll()
                .stream()
                .map(PersonaAutorizadaResponse::new)
                .collect(Collectors.toList());
    }
}