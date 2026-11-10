package org.brinka.brinkaapi.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Builder
public class Payment {
  private Integer id;
  private PaymentType tipo;
  private PaymentStatus status;
  private BigDecimal valor;
  private LocalDateTime dataPagamento;
}
