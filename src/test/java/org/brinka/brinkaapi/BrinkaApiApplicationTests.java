package org.brinka.brinkaapi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled("Requer banco de dados e Redis reais; reativar quando houver testcontainers")
@SpringBootTest
class BrinkaApiApplicationTests {

  @Test
  void contextLoads() {}
}
