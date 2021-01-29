package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.Customer;
import pl.sood.rentcarapplicationbackend.model.Rental;
import pl.sood.rentcarapplicationbackend.repository.CustomerRepo;
import pl.sood.rentcarapplicationbackend.repository.RentalRepo;
import pl.sood.rentcarapplicationbackend.service.CustomerService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CustomerController {

    private final CustomerRepo customerRepo;
    private final RentalRepo rentalRepo;
    private final CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @GetMapping("/customers/{driverLicenseNumber}")
    public Customer getCustomerByDriverLicenseNumber(@PathVariable String driverLicenseNumber) {
        return customerRepo.findById(driverLicenseNumber).orElseThrow(RuntimeException::new);
    }

    @PostMapping("/customers")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @PutMapping("/customers")
    public void updateCar(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @DeleteMapping("/customers/{driverLicenseNumber}")
    public void deleteCar(@PathVariable String driverLicenseNumber) {
        customerService.deleteCustomer(driverLicenseNumber);
    }


}
