package pl.sood.rentcarapplicationbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.sood.rentcarapplicationbackend.model.Customer;
import pl.sood.rentcarapplicationbackend.model.Employee;
import pl.sood.rentcarapplicationbackend.repository.CustomerRepo;
import pl.sood.rentcarapplicationbackend.repository.EmployeeRepo;
import pl.sood.rentcarapplicationbackend.service.CustomerService;
import pl.sood.rentcarapplicationbackend.service.EmployeeService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {

    private final EmployeeRepo employeeRepo;
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllCustomers() {
        return employeeRepo.findAll();
    }


    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeRepo.findById(id).orElseThrow(RuntimeException::new);
    }
}
