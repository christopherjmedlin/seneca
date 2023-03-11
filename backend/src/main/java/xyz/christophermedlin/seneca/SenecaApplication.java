package xyz.christophermedlin.seneca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.repositories.UserRepository;

@SpringBootApplication
@EnableJpaRepositories("xyz.christophermedlin.seneca.repositories")
@EntityScan("xyz.christophermedlin.seneca.entities")
public class SenecaApplication {

	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SenecaApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDB(ApplicationContext ctx) {
		return args -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String password = encoder.encode("asdf");
			User u = new User("admin", password);
			userRepo.save(u);
		};
	}
}
