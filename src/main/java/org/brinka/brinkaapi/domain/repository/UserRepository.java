package org.brinka.brinkaapi.domain.repository;

import java.util.Optional;
import org.brinka.brinkaapi.domain.model.User;

public interface UserRepository {
  Optional<User> findUserByEmail(String email);

  User saveUser(User user);
}
