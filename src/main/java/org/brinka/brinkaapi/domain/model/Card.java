package org.brinka.brinkaapi.domain.model;

import java.util.Date;
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
public class Card {
  private Integer id;
  private User usuario;
  private String numeroCartao;
  private String nomeTitular;
  private Date dataValidade;
  private String cvc;
}
