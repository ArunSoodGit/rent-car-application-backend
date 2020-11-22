package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.Customer;
import pl.sood.rentcarapplicationbackend.repository.CustomerRepo;
import pl.sood.rentcarapplicationbackend.service.CustomerService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CustomerController {

    private final CustomerRepo customerRepo;
    private final CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @PostMapping("/customers")
    public void addCustomer(@RequestBody Customer customer) {
      customerService.addCustomer(customer);
    }

}
