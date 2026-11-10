package org.brinka.brinkaapi.domain.model;

import java.math.BigDecimal;
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
public class Product {
  private Integer id;
  private String imagem;
  private String nome;
  private Category categoria;
  private String descricao;
  private BigDecimal preco;
  private Integer estoque;
  private List<Review> avaliacoes;
}
