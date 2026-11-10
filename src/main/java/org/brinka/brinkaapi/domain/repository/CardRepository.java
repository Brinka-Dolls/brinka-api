package org.brinka.brinkaapi.domain.repository;

import java.util.Optional;
import org.brinka.brinkaapi.domain.model.Card;
import org.brinka.brinkaapi.domain.model.User;

public interface CardRepository {
  Card saveCard(Card card);

  Optional<Card> findCardByUser(User user);
}
