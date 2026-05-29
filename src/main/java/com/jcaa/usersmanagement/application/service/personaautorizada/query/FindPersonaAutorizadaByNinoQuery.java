package com.jcaa.usersmanagement.application.service.personaautorizada.query;

import lombok.Getter;

@Getter
public class FindPersonaAutorizadaByNinoQuery {

    private final Long ninoId;

    public FindPersonaAutorizadaByNinoQuery(Long ninoId) {
        this.ninoId = ninoId;
    }
}