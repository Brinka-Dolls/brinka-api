package org.brinka.brinkaapi.application.usecase.product;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.brinka.brinkaapi.application.annotation.UseCase;
import org.brinka.brinkaapi.domain.model.Product;
import org.brinka.brinkaapi.domain.repository.ProductRepository;

@UseCase
@RequiredArgsConstructor
public class GetAllProductsUseCase {
  private final ProductRepository productRepository;

  public List<Product> execute() {
    return productRepository.findProducts();
  }
}
