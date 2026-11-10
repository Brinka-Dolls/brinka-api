package org.brinka.brinkaapi.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
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
public class Order {
  private Integer id;
  private User usuario;
  private OrderStatus status;
  private List<OrderItem> itens;
  private Payment pagamento;
  private BigDecimal subtotal;
  private BigDecimal desconto;
  private BigDecimal frete;
  private BigDecimal total;
  private LocalDateTime dataPedido;
}
