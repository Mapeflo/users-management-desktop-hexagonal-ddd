package com.jcaa.usersmanagement.application.service.personaautorizada;

import com.jcaa.usersmanagement.application.port.in.CreatePersonaAutorizadaUseCase;
import com.jcaa.usersmanagement.application.port.out.SavePersonaAutorizadaPort;
import com.jcaa.usersmanagement.application.service.personaautorizada.command.CreatePersonaAutorizadaCommand;
import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.Dni;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreatePersonaAutorizadaService implements CreatePersonaAutorizadaUseCase {

    private final SavePersonaAutorizadaPort savePersonaAutorizadaPort;

    @Override
    public PersonaAutorizadaResponse execute(CreatePersonaAutorizadaCommand command) {
        PersonaAutorizada persona = new PersonaAutorizada(
                null,
                command.getDni(),
                command.getNombreCompleto(),
                command.getDireccion(),
                command.getTelefono(),
                command.getRelacionConNino(),
                command.getNumeroCuentaBancaria(),
                command.isEsResponsablePago()
        );

        PersonaAutorizada saved = savePersonaAutorizadaPort.save(persona);
        return new PersonaAutorizadaResponse(saved);
    }
}
