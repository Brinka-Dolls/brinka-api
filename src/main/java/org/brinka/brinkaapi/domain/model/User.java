package org.brinka.brinkaapi.domain.model;

import java.util.List;
import lombok.*;

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
