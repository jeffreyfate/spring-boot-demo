package com.example.demo.payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
      log.info(String.format("Preloading %s", repository.save(new Employee("Bilbo Baggins", "burglar"))));
      log.info(String.format("Preloading %s", repository.save(new Employee("Frodo Baggins", "thief"))));
    };
  }
}