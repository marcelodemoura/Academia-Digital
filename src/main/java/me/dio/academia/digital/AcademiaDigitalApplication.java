package me.dio.academia.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages={
		"com.example.something", "com.example.application"})
@EnableJpaRepositories(
		entityManagerFactoryRef = "someEntityManagerFactory",
		transactionManagerRef = "someTransactionManager",
		basePackages = {"com.pack.some.database.repository"})

public class AcademiaDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademiaDigitalApplication.class, args);
	}

}
