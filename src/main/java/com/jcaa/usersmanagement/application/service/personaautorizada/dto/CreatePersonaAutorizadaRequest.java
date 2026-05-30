package com.jcaa.usersmanagement.application.service.personaautorizada.dto;

import lombok.Getter;

@Getter
public class CreatePersonaAutorizadaRequest {

    private final String dni;
    private final String nombreCompleto;
    private final String direccion;
    private final String telefono;
    private final String relacionConNino;
    private final String numeroCuentaBancaria;
    private final boolean esResponsablePago;

    public CreatePersonaAutorizadaRequest(String dni, String nombreCompleto, String direccion,
                                          String telefono, String relacionConNino,
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