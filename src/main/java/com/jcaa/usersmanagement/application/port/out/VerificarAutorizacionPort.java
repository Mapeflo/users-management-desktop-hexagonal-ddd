package com.jcaa.usersmanagement.application.port.out;

public interface VerificarAutorizacionPort {

    boolean existsByDniAndNinoId(String dni, Long ninoId);
}
