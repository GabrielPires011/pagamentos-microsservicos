package com.br.pagamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.UUID;

@Entity
@Table(name = "cartoes")
public class Cartao {

    @Id
    private UUID id;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
}
