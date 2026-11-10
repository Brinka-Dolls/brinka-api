package org.brinka.brinkaapi.domain.repository;

import java.util.Optional;
import org.brinka.brinkaapi.domain.model.PaymentStatus;

public interface PaymentStatusRepository {
  Optional<PaymentStatus> findByDescricao(String descricao);
}
