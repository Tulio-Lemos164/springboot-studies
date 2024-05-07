package br.com.studies.resources;

import br.com.studies.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Dwight", "dwight@gmail.com", "982351490", "DMKing");
        return ResponseEntity.ok().body(u);
    }
}
