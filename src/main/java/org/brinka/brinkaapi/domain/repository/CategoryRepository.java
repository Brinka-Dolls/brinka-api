package org.brinka.brinkaapi.domain.repository;

import java.util.List;
import java.util.Optional;
import org.brinka.brinkaapi.domain.model.Category;

public interface CategoryRepository {
  List<Category> findAll();

  Optional<Category> findById(Integer id);
}
