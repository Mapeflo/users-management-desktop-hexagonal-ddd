package com.jcaa.usersmanagement.domain.model.personaautorizada;

public class PersonaAutorizadaNotFoundException extends RuntimeException {

    public PersonaAutorizadaNotFoundException(String dni) {
        super("No se encontró persona autorizada con DNI: " + dni);
    }

    public PersonaAutorizadaNotFoundException(Long id) {
        super("No se encontró persona autorizada con ID: " + id);
    }
}