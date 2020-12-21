package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.Customer;
import pl.sood.rentcarapplicationbackend.model.Employee;
import pl.sood.rentcarapplicationbackend.model.Rental;
import pl.sood.rentcarapplicationbackend.repository.*;
import pl.sood.rentcarapplicationbackend.service.RentalsService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class RentalController {


    private final RentalRepo rentalRepo;
    private final EmployeeRepo employeeRepo;
    private final RentalsService rentalsService;

    @GetMapping("/rentals")
    public List<Rental> getAllRentals(){
        return rentalRepo.findAll();
    }

    @GetMapping("/rentals/{id}")
    public Rental getRentalById(@PathVariable int id) {
        return rentalRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/rentals")
    public void addRental(@RequestBody Rental rental) throws Exception {
        Employee employee = employeeRepo.findById(1L).orElseThrow(() -> new Exception());
        rental.setEmployee(employee);
        rentalsService.addRental(rental);}

}
