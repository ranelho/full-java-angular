package com.rlti.clientes.rest;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.rlti.clientes.model.entity.Cliente;
import com.rlti.clientes.model.repository.ClienteRepository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

class ClienteControllerTest {
    /**
     * Method under test: {@link ClienteController#acharPorId(Integer)}
     */
    @Test
    void testAcharPorId() {
        ClienteRepository clienteRepository = mock(ClienteRepository.class);
        Cliente cliente = new Cliente();
        when(clienteRepository.findById((Integer) any())).thenReturn(Optional.of(cliente));
        assertSame(cliente, (new ClienteController(clienteRepository)).acharPorId(1));
        verify(clienteRepository).findById((Integer) any());
    }
}

