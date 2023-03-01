package com.rlti.clientes.rest;

import com.rlti.clientes.model.entity.Cliente;
import com.rlti.clientes.model.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody  Cliente cliente){
        return repository.save(cliente);
    }


}