package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "jhanina.romero@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 9)
            );
            Student jose = new Student(
                    "Jose",
                    "jose.arce@gmail.com",
                    LocalDate.of(1998, Month.JULY, 19)
            );

            repository.saveAll(List.of(maria, jose));
        };
    }
}
