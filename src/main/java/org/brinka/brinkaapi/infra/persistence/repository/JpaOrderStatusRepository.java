package org.brinka.brinkaapi.infra.persistence.repository;

import java.util.Optional;
import org.brinka.brinkaapi.infra.persistence.entity.OrderStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderStatusRepository extends JpaRepository<OrderStatusEntity, Integer> {
  Optional<OrderStatusEntity> findByDescricao(String descricao);
}
