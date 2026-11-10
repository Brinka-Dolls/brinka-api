package org.brinka.brinkaapi.infra.persistence.repository;

import java.util.Optional;
import org.brinka.brinkaapi.infra.persistence.entity.PaymentStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPaymentStatusRepository extends JpaRepository<PaymentStatusEntity, Integer> {
  Optional<PaymentStatusEntity> findByDescricao(String descricao);
}
