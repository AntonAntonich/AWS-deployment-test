package com.example.amigosecodeawslearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AmigosecodeAwsLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigosecodeAwsLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(StudentRepo studentRepo) {
        return args -> {
            for (int i = 0; i < 5; i++) {
                studentRepo.save(new Student(i, "name" + i, 10 + i));
            }
        };
    }

}
