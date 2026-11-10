package org.brinka.brinkaapi.domain.repository;

import java.util.Optional;
import org.brinka.brinkaapi.domain.model.OrderStatus;

public interface OrderStatusRepository {
  Optional<OrderStatus> findByDescricao(String descricao);
}
