package org.brinka.brinkaapi.domain.model;

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
public class Address {
  private Integer id;
  private Integer idUsuario;
  private String cep;
  private String rua;
  private Integer numero;
  private String complemento;
  private String cidade;
  private String estado;
}
