package ma.supdeco.pedagogie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PedagogieApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedagogieApplication.class, args);
	}
	

}
