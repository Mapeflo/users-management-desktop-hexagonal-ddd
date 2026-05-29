package com.jcaa.usersmanagement.application.port.in;

public interface VerificarAutorizacionUseCase {

    boolean execute(String dni, Long ninoId);
}
