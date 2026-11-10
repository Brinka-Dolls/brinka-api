package org.brinka.brinkaapi.application.dto.output;

import java.math.BigDecimal;
import java.util.List;
import lombok.Builder;

@Builder
public record CartOutput(List<CartItemOutput> items, BigDecimal total) {}
