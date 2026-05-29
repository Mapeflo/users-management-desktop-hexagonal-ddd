package com.jcaa.usersmanagement.domain.model.personaautorizada.vo;

import lombok.Getter;

@Getter
public class Dni {

    private final String value;

    public Dni(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío");
        }
        if (value.length() < 5 || value.length() > 20) {
            throw new IllegalArgumentException("El DNI debe tener entre 5 y 20 caracteres");
        }
        this.value = value.trim().toUpperCase();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dni dni = (Dni) o;
        return value.equals(dni.value);
    }
}