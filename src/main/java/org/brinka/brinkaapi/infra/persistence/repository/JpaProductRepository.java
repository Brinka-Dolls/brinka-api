package org.brinka.brinkaapi.infra.persistence.repository;

import java.util.Optional;
import org.brinka.brinkaapi.infra.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Integer> {
  @EntityGraph(value = "Product.avaliacoes")
  Optional<ProductEntity> findWithAvaliacoesById(Integer id);
}
