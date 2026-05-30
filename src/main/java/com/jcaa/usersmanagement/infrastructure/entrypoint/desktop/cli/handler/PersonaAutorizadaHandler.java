package com.jcaa.usersmanagement.infrastructure.entrypoint.desktop.cli.handler;

import com.jcaa.usersmanagement.application.port.in.*;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonaAutorizadaHandler {

    private final CreatePersonaAutorizadaUseCase createPersonaAutorizadaUseCase;
    private final ListPersonaAutorizadaUseCase listPersonaAutorizadaUseCase;
    private final VerificarAutorizacionUseCase verificarAutorizacionUseCase;

    public void createPersonaAutorizada(/* parámetros */) {

        System.out.println("Crear persona autorizada - pendiente");
    }

    public List<PersonaAutorizadaResponse> listPersonas() {
        return listPersonaAutorizadaUseCase.execute();
    }

    public boolean verificarAutorizacion(String dni, Long ninoId) {
        return verificarAutorizacionUseCase.execute(dni, ninoId);
    }
}