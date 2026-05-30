package com.jcaa.usersmanagement.infrastructure.adapter.persistence.repository;

import com.jcaa.usersmanagement.application.port.out.*;
import com.jcaa.usersmanagement.domain.model.personaautorizada.PersonaAutorizada;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.Dni;
import com.jcaa.usersmanagement.domain.model.personaautorizada.vo.RelacionConNino;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log
@RequiredArgsConstructor
public final class PersonaAutorizadaRepositoryMySQL
        implements SavePersonaAutorizadaPort,
        FindPersonaAutorizadaByIdPort,
        ListPersonaAutorizadaPort,
        DeletePersonaAutorizadaPort,
        VerificarAutorizacionPort {

    private final Connection connection;

    @Override
    public PersonaAutorizada save(PersonaAutorizada persona) {
        String sql = """
            INSERT INTO persona_autorizada 
            (dni, nombre_completo, direccion, telefono, relacion_con_nino, 
             numero_cuenta_bancaria, es_responsable_pago)
            VALUES (?, ?, ?, ?, ?, ?, ?)
            """;

        try (PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, persona.getDni().getValue());
            stmt.setString(2, persona.getNombreCompleto());
            stmt.setString(3, persona.getDireccion());
            stmt.setString(4, persona.getTelefono());
            stmt.setString(5, persona.getRelacionConNino().name());
            stmt.setString(6, persona.getNumeroCuentaBancaria());
            stmt.setBoolean(7, persona.esResponsableDePago());

            stmt.executeUpdate();
            return persona;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar persona autorizada", e);
        }
    }

    @Override
    public Optional<PersonaAutorizada> findById(Long id) {
        // Implementación básica
        return Optional.empty();
    }

    @Override
    public List<PersonaAutorizada> findAll() {
        return new ArrayList<>();
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public boolean existsByDniAndNinoId(String dni, Long ninoId) {
        return false;
    }
}
