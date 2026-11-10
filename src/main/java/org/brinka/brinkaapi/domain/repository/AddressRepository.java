package org.brinka.brinkaapi.domain.repository;

import java.util.Optional;
import org.brinka.brinkaapi.domain.model.Address;
import org.brinka.brinkaapi.domain.model.User;

public interface AddressRepository {
  Optional<Address> findAddressByUser(User user);

  Address save(Address address);
}
