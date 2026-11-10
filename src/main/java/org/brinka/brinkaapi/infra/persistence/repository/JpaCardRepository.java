package org.brinka.brinkaapi.infra.persistence.repository;

import java.util.Optional;
import org.brinka.brinkaapi.infra.persistence.entity.CardEntity;
import org.brinka.brinkaapi.infra.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCardRepository extends JpaRepository<CardEntity, Integer> {
  Optional<CardEntity> findByUsuario(UserEntity usuario);
}
