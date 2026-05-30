package com.jcaa.usersmanagement.infrastructure.entrypoint.desktop.cli.handler;

import com.jcaa.usersmanagement.application.service.personaautorizada.dto.PersonaAutorizadaResponse;
import com.jcaa.usersmanagement.infrastructure.entrypoint.desktop.cli.io.ConsoleIO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonaAutorizadaMenuHandler implements OperationHandler {

    private final PersonaAutorizadaHandler personaAutorizadaHandler;
    private final ConsoleIO console;

    @Override
    public void handle() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = console.readInt("\n  Option: ");

            try {
                switch (choice) {
                    case 1 -> createPersona();
                    case 2 -> listPersonas();
                    case 3 -> verificarAutorizacion();
                    case 0 -> running = false;
                    default -> console.println("  Opción inválida.");
                }
            } catch (Exception e) {
                console.println("  Error: " + e.getMessage());
            }
        }
    }

    private void printMenu() {
        console.println("\n  === Gestión de Personas Autorizadas ===");
        console.println("  [1] Crear Persona Autorizada");
        console.println("  [2] Listar Personas Autorizadas");
        console.println("  [3] Verificar Autorización para recoger niño");
        console.println("  [0] Volver al menú principal");
    }

    private void createPersona() {
        console.println("Funcionalidad de crear en desarrollo...");
    }

    private void listPersonas() {
        List<PersonaAutorizadaResponse> personas = personaAutorizadaHandler.listPersonas();
        console.println("\nLista de Personas Autorizadas:");
        if (personas.isEmpty()) {
            console.println("  No hay personas autorizadas registradas.");
        } else {
            personas.forEach(p -> console.println(" - " + p.getNombreCompleto() + " (DNI: " + p.getDni() + ")"));
        }
    }

    private void verificarAutorizacion() {
        String dni = console.readRequired("DNI de la persona: ");
        Long ninoId = Long.valueOf(console.readRequired("ID del niño: "));
        boolean autorizado = personaAutorizadaHandler.verificarAutorizacion(dni, ninoId);
        console.println(autorizado ?
                "✅ La persona ESTÁ autorizada para recoger al niño" :
                "❌ La persona NO está autorizada");
    }
}