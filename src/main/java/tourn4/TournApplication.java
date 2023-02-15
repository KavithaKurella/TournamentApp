package tourn4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.model")
@SpringBootApplication(scanBasePackages="com.controller,com.dao,com.service")
@EnableJpaRepositories("com.repository")
public class TournApplication {

	public static void main(String[] args) {
		SpringApplication.run(TournApplication.class, args);
	}

}
