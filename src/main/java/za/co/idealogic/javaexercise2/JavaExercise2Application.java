package za.co.idealogic.javaexercise2;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
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
		
		Options options = new Options();

        Option byeOption = Option.builder("b")
        		.required(false)
                .desc("Say goodbye too")
                .build();
        options.addOption(byeOption);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            log.error(e.getMessage(),e);
            formatter.printHelp("application", options);

            System.exit(1);
            return;
        }

        final boolean bye = cmd.hasOption('b');

        if(bye) {
        	log.info("Bye world");
        }

        log.info("Java Exercise 2: Application ended!");
	}
}
