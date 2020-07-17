package za.co.idealogic.javaexercise2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaExercise2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaExercise2Application.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Java Exercise 2: Application started!");
	}
}
