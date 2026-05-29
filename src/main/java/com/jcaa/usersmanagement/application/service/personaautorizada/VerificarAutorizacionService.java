package com.jcaa.usersmanagement.application.service.personaautorizada;

import com.jcaa.usersmanagement.application.port.in.VerificarAutorizacionUseCase;
import com.jcaa.usersmanagement.application.port.out.VerificarAutorizacionPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VerificarAutorizacionService implements VerificarAutorizacionUseCase {

    private final VerificarAutorizacionPort verificarAutorizacionPort;

    @Override
    public boolean execute(String dni, Long ninoId) {
        return verificarAutorizacionPort.existsByDniAndNinoId(dni, ninoId);
    }
}

