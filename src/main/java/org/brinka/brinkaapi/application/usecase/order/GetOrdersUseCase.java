package org.brinka.brinkaapi.application.usecase.order;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.brinka.brinkaapi.application.annotation.UseCase;
import org.brinka.brinkaapi.domain.exception.UserNotFoundException;
import org.brinka.brinkaapi.domain.model.Order;
import org.brinka.brinkaapi.domain.repository.OrderRepository;
import org.brinka.brinkaapi.domain.repository.UserRepository;

@UseCase
@RequiredArgsConstructor
public class GetOrdersUseCase {
  private final OrderRepository orderRepository;
  private final UserRepository userRepository;

  public List<Order> execute(String email) {
    var user = userRepository.findUserByEmail(email).orElseThrow(UserNotFoundException::new);

    return orderRepository.findAllByUser(user);
  }
}
