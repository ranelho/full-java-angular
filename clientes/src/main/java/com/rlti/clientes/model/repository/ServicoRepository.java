package com.rlti.clientes.model.repository;

import com.rlti.clientes.model.entity.Cliente;
import com.rlti.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
