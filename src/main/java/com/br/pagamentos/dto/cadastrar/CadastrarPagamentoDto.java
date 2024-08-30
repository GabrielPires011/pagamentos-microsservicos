package com.br.pagamentos.dto.cadastrar;

import com.br.pagamentos.model.Status;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.UUID;

public record CadastrarPagamentoDto(@NotNull @Positive BigDecimal valor,
                                    @NotNull Status status,
                                    @NotNull UUID pedidoId,
                                    @NotNull UUID formaDePagamentoID,
                                    @NotNull UUID cartaoId) {
}
