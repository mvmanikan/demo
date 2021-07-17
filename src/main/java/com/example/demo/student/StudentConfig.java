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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mani = new Student(
                    "Mani Murugan",
                    "mvmanikan@gmail.com",
                    LocalDate.of(1982, Month.FEBRUARY, 15)
                    );

            Student kavin = new Student(
                    "Kavin Mani",
                    "kavin@gmail.com",
                    LocalDate.of(2015, Month.MARCH, 24)
                    );

            studentRepository.saveAll(List.of(mani,kavin));
        };
    }
}
