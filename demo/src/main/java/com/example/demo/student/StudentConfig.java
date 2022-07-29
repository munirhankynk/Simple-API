package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student maria = new Student(
                    "maria",
                    "maria.star@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );


            Student lebron;
            lebron = new Student(
                    "LeBron",
                    "lebron.james@gmail.com",
                    LocalDate.of(1984, Month.DECEMBER, 30)
            );

            repository.saveAll(
                    List.of(maria, lebron)
            );
        };
    }
}
