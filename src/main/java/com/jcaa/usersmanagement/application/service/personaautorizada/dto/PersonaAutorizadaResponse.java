package com.jcaa.usersmanagement.application.service.personaautorizada.dto;

import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;
import lombok.Getter;

@Getter
public class PersonaAutorizadaResponse {

    private final Long id;
    private final String dni;
    private final String nombreCompleto;
    private final String direccion;
    private final String telefono;
    private final String relacionConNino;
    private final String numeroCuentaBancaria;
    private final boolean esResponsablePago;

    public PersonaAutorizadaResponse(PersonaAutorizada persona) {
        this.id = persona.getId();
        this.dni = persona.getDni().getValue();
        this.nombreCompleto = persona.getNombreCompleto();
        this.direccion = persona.getDireccion();
        this.telefono = persona.getTelefono();
        this.relacionConNino = persona.getRelacionConNino().getDescripcion();
        this.numeroCuentaBancaria = persona.getNumeroCuentaBancaria();
        this.esResponsablePago = persona.esResponsableDePago();
    }
}