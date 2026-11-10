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
public class CartItem {

  private Integer productId;
  private Integer quantity;

  public void increment() {
    this.quantity++;
  }

  public void decrement() {
    this.quantity--;
  }
}
