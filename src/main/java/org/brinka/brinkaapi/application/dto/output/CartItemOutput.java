package org.brinka.brinkaapi.application.dto.output;

import java.math.BigDecimal;
import lombok.Builder;

@Builder
public record CartItemOutput(
    Integer productId, String nome, String imagem, BigDecimal preco, Integer quantidade) {}
