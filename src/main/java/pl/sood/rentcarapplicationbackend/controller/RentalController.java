package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.Rental;
import pl.sood.rentcarapplicationbackend.repository.CarClassRepo;
import pl.sood.rentcarapplicationbackend.repository.CarMarkModelRepo;
import pl.sood.rentcarapplicationbackend.repository.CarRepo;
import pl.sood.rentcarapplicationbackend.repository.RentalRepo;
import pl.sood.rentcarapplicationbackend.service.RentalsService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class RentalController {


    private final RentalRepo rentalRepo;
    private final RentalsService rentalsService;

    @GetMapping("/rentals")
    public List<Rental> getAllRentals(){
        return rentalRepo.findAll();
    }

    @PostMapping("/rentals")
    public void addRental(@RequestBody Rental rental){rentalsService.addRental(rental);}

}
