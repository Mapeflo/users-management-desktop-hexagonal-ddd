package com.jcaa.usersmanagement.domain.model.personaautorizada.vo;

public enum RelacionConNino {

    MADRE("Madre"),
    PADRE("Padre"),
    ABUELO("Abuelo"),
    ABUELA("Abuela"),
    TIO("Tío"),
    TIA("Tía"),
    HERMANO("Hermano"),
    HERMANA("Hermana"),
    TUTOR_LEGAL("Tutor Legal"),
    NINERA("Niñera"),
    OTRO("Otro");

    private final String descripcion;

    RelacionConNino(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}


