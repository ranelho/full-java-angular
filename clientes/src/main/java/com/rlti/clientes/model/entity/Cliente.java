package com.rlti.clientes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;
    @Column
    private BigDecimal valor;

    @PrePersist
    public void prePersist(){
        setDataCadastro(LocalDate.now());
    }
}