package br.com.studies.config;

import br.com.studies.entities.User;
import br.com.studies.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Dwight", "dwight@gmail.com", "982351490", "DMKing");
        User u2 = new User(null, "Jim", "jim@gmail.com", "972264309", "philadelphia");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
