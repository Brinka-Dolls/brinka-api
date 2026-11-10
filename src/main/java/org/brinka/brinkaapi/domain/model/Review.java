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
public class Review {
  private Integer id;
  private Product produto;
  private User usuario;
  private String comentario;
  private Integer nota;
  private Date data;
}
