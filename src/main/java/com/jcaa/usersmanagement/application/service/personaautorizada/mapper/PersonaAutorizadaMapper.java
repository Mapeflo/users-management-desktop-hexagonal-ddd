package com.jcaa.usersmanagement.application.service.personaautorizada.mapper;

import com.jcaa.usersmanagement.application.service.personaautorizada.command.CreatePersonaAutorizadaCommand;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.Dni;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;

public class PersonaAutorizadaMapper {

    public static PersonaAutorizada toEntity(CreatePersonaAutorizadaCommand command) {
        return new PersonaAutorizada(
                null,
                command.getDni(),
                command.getNombreCompleto(),
                command.getDireccion(),
                command.getTelefono(),
                command.getRelacionConNino(),
                command.getNumeroCuentaBancaria(),
                command.isEsResponsablePago()
        );
    }

    public static PersonaAutorizadaResponse toResponse(PersonaAutorizada persona) {
        return new PersonaAutorizadaResponse(persona);
    }
}
