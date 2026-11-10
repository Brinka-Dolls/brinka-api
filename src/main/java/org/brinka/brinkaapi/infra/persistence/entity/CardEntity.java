package org.brinka.brinkaapi.infra.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_cartao")
public class CardEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @JdbcTypeCode(SqlTypes.CHAR)
  @Column(length = 16)
  private String numeroCartao;

  private LocalDate dataValidade;
  private String nomeTitular;

  @JdbcTypeCode(SqlTypes.CHAR)
  @Column(length = 3)
  private String cvc;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "id_usuario", nullable = false, unique = true)
  private UserEntity usuario;
}
