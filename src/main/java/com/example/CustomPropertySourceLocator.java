package com.example;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

public class CustomPropertySourceLocator implements PropertySourceLocator {
  public PropertySource<?> locate(Environment environment) {
    return new CustomPropertySource("My-Custom-Bootstrap-Property-Source");
  }
}
