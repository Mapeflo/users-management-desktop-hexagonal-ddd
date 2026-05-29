package com.jcaa.usersmanagement.application.service.personaautorizada.command;

import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.Dni;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;
import lombok.Getter;

@Getter
public class CreatePersonaAutorizadaCommand {

    private final Dni dni;
    private final String nombreCompleto;
    private final String direccion;
    private final String telefono;
    private final RelacionConNino relacionConNino;
    private final String numeroCuentaBancaria;
    private final boolean esResponsablePago;

    public CreatePersonaAutorizadaCommand(Dni dni, String nombreCompleto, String direccion,
                                          String telefono, RelacionConNino relacionConNino,
                                          String numeroCuentaBancaria, boolean esResponsablePago) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.relacionConNino = relacionConNino;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.esResponsablePago = esResponsablePago;
    }
}