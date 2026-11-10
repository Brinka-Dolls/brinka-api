package org.brinka.brinkaapi.infra.persistence.repository.impl;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.brinka.brinkaapi.domain.model.OrderStatus;
import org.brinka.brinkaapi.domain.repository.OrderStatusRepository;
import org.brinka.brinkaapi.infra.persistence.mapper.OrderStatusMapper;
import org.brinka.brinkaapi.infra.persistence.repository.JpaOrderStatusRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaOrderStatusRepositoryAdapter implements OrderStatusRepository {
  private final JpaOrderStatusRepository jpaRepository;
  private final OrderStatusMapper mapper;

  @Override
  public Optional<OrderStatus> findByDescricao(String descricao) {
    return jpaRepository.findByDescricao(descricao).map(mapper::toDomain);
  }
}
