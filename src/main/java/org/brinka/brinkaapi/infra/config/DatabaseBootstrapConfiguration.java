package org.brinka.brinkaapi.infra.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration(proxyBeanMethods = false)
public class DatabaseBootstrapConfiguration {

  @Bean
  public static BeanPostProcessor databaseBootstrapPostProcessor(Environment environment) {
    return new DatabaseBootstrapPostProcessor(environment);
  }
}
