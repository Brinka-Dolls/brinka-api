package org.brinka.brinkaapi.infra.persistence.repository;

import java.util.Optional;
import org.brinka.brinkaapi.infra.persistence.entity.PaymentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPaymentTypeRepository extends JpaRepository<PaymentTypeEntity, Integer> {
  Optional<PaymentTypeEntity> findByDescricao(String descricao);
}
