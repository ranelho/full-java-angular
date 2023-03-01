package com.rlti.clientes.model.entity;

import jakarta.persistence.*;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 150)
    private String descricao;
    @ManyToMany
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
