package za.co.idealogic.javaexercise2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaExercise2Application implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(JavaExercise2Application.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Java Exercise 2: Application started!");
        log.info("Java Exercise 2: Application ended!");
	}
}
