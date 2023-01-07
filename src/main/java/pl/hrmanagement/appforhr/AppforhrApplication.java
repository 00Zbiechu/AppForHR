package pl.hrmanagement.appforhr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AppforhrApplication {


	public static void main(String[] args) {
		SpringApplication.run(AppforhrApplication.class, args);
	}

}
