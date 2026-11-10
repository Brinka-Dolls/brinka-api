package org.brinka.brinkaapi.domain.repository;

import java.util.List;
import java.util.Optional;
import org.brinka.brinkaapi.domain.model.Order;
import org.brinka.brinkaapi.domain.model.User;

public interface OrderRepository {
  Order save(Order order);

  Optional<Order> findByIdAndUser(Integer id, User user);

  List<Order> findAllByUser(User user);
}
