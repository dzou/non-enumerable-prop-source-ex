package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  @Value("${foobar.foobar}")
  public String testProperty;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
