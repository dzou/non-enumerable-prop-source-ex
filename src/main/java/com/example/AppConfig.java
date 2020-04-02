package com.example;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public PropertySourceLocator secretManagerPropertySourceLocator() {
    return new CustomPropertySourceLocator();
  }
}
