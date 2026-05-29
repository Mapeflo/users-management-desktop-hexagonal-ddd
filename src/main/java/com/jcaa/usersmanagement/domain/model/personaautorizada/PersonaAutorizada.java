package com.jcaa.usersmanagement.domain.model.personaautorizada;

import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.Dni;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;
import lombok.Getter;

@Getter
public class PersonaAutorizada {

    private final Long id;
    private final Dni dni;
    private final String nombreCompleto;
    private final String direccion;
    private final String telefono;
    private final RelacionConNino relacionConNino;
    private final String numeroCuentaBancaria;
    private final boolean esResponsablePago;

    public PersonaAutorizada(
            Long id,
            Dni dni,
            String nombreCompleto,
            String direccion,
            String telefono,
            RelacionConNino relacionConNino,
            String numeroCuentaBancaria,
            boolean esResponsablePago) {

        this.id = id;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.relacionConNino = relacionConNino;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.esResponsablePago = esResponsablePago;
    }

    public boolean esResponsableDePago() {
        return esResponsablePago;
    }
}