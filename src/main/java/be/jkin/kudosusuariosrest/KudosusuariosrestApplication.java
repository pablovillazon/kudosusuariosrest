package be.jkin.kudosusuariosrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class KudosusuariosrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KudosusuariosrestApplication.class, args);
	}

}
