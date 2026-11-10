package org.brinka.brinkaapi.domain.repository;

import java.util.Optional;
import org.brinka.brinkaapi.domain.model.PaymentType;

public interface PaymentTypeRepository {
  Optional<PaymentType> findByDescricao(String descricao);
}
