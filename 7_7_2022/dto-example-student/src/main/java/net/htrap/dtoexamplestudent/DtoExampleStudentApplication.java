package net.htrap.dtoexamplestudent;

import net.htrap.dtoexamplestudent.Model.User;
import net.htrap.dtoexamplestudent.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoExampleStudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoExampleStudentApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Parth");
		user1.setLastName("Bhatia");
		user1.setEmail("bhatiaparth119@gmail.com");
		user1.setPassword("Htrap.Op");
		userRepository.save(user1);

		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Htrap");
		user2.setLastName("Wood");
		user2.setEmail("Valorant@gmail.com");
		user2.setPassword("Htrap_1862");
		userRepository.save(user2);
	}
}
