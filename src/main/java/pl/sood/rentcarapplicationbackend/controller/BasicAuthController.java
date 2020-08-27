package pl.sood.rentcarapplicationbackend.controller;

import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.AppUser;
import pl.sood.rentcarapplicationbackend.model.User;
import pl.sood.rentcarapplicationbackend.repository.AppUserRepo;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class BasicAuthController {


    @GetMapping({ "/validateLogin" })
    public User basicauth() {

        return new User("User successfully authenticated");
    }

 

}
