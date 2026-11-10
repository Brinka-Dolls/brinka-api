package org.brinka.brinkaapi.domain.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
  private Integer id;
  private String nome;
  private String email;
  private String telefone;
  private Address address;
  private String senha;
  private Boolean ehAdmin;
  private List<Review> avaliacoes;
}
