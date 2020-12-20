package pl.sood.rentcarapplicationbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sood.rentcarapplicationbackend.model.Employee;
import pl.sood.rentcarapplicationbackend.repository.EmployeeRepo;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }


}
