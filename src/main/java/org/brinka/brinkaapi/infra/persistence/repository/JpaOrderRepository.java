package org.brinka.brinkaapi.infra.persistence.repository;

import java.util.List;
import java.util.Optional;
import org.brinka.brinkaapi.infra.persistence.entity.OrderEntity;
import org.brinka.brinkaapi.infra.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderRepository extends JpaRepository<OrderEntity, Integer> {
  @EntityGraph(
      attributePaths = {
        "itens",
        "itens.boneco",
        "pagamento",
        "pagamento.tipo",
        "pagamento.status",
        "status",
        "usuario"
      })
  Optional<OrderEntity> findByIdAndUsuario(Integer id, UserEntity usuario);

  @EntityGraph(
      attributePaths = {
        "itens",
        "itens.boneco",
        "pagamento",
        "pagamento.tipo",
        "pagamento.status",
        "status",
        "usuario"
      })
  List<OrderEntity> findAllByUsuarioOrderByDataPedidoDesc(UserEntity usuario);
}
