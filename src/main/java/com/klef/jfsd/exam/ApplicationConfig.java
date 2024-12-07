package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Employee employee() {
        return new Employee(1, "John Doe", 50000.0, "IT", List.of("Java", "Spring", "SQL"));
    }

    @Bean
    public Instructor instructor() {
        return new Instructor(101, "Dr. Smith", "smith@university.com", "1234567890");
    }

    @Bean
    public Course course() {
        return new Course(201, "Spring Framework", 3, instructor());
    }
}
