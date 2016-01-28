package co.masslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.auth0")
@ImportResource("classpath:auth0-security-context.xml")
@PropertySource("classpath:auth0.properties")
@SpringBootApplication
public class ShibaAuth0Application {

	public static void main(String[] args) {
		SpringApplication.run(ShibaAuth0Application.class, args);
	}
}
