package com.jcaa.usersmanagement.application.service.personaautorizada;

import com.jcaa.usersmanagement.application.port.in.VerificarAutorizacionUseCase;
import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizadaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VerificarAutorizacionService implements VerificarAutorizacionUseCase {

    private final PersonaAutorizadaRepository personaAutorizadaRepository;

    @Override
    public boolean execute(String dni, Long ninoId) {

        return personaAutorizadaRepository.existsByDni(dni);
    }
}

