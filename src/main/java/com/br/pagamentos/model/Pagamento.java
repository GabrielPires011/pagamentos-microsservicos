package com.br.pagamentos.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    private UUID id;
    private BigDecimal valor;
    @Enumerated(EnumType.STRING)
    private Status status;
    private UUID pedidoId;
    private UUID formaPagamentoId;
    @ManyToOne
    private Cartao cartao;
}
