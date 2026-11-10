package org.brinka.brinkaapi.infra.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_pedido")
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "id_usuario")
  private UserEntity usuario;

  @ManyToOne
  @JoinColumn(name = "id_status")
  private OrderStatusEntity status;

  private BigDecimal subtotal;
  private BigDecimal desconto;
  private BigDecimal frete;
  private BigDecimal total;

  @Column(name = "data_pedido")
  private LocalDateTime dataPedido;

  @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<OrderItemEntity> itens;

  @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
  private PaymentEntity pagamento;
}
