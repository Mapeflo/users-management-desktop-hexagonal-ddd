package com.jcaa.usersmanagement.application.service.personaautorizada.mapper;

import com.jcaa.usersmanagement.application.service.personaautorizada.dto.CreatePersonaAutorizadaRequest;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.Dni;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;

public class PersonaAutorizadaInfraMapper {

    public static PersonaAutorizada toEntity(CreatePersonaAutorizadaRequest request) {
        return new PersonaAutorizada(
                null,
                new Dni(request.getDni()),
                request.getNombreCompleto(),
                request.getDireccion(),
                request.getTelefono(),
                RelacionConNino.valueOf(request.getRelacionConNino().toUpperCase()),
                request.getNumeroCuentaBancaria(),
                request.isEsResponsablePago()
        );
    }

    public static PersonaAutorizadaResponse toResponse(PersonaAutorizada persona) {
        return new PersonaAutorizadaResponse(persona);
    }
}