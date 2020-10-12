package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sood.rentcarapplicationbackend.model.CarClass;
import pl.sood.rentcarapplicationbackend.repository.CarClassRepo;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClassController {
    private final CarClassRepo carClassRepo;
    @GetMapping("/classes")
    public List<CarClass> getAllClasses() {
        return carClassRepo.findAll();
    }
}
