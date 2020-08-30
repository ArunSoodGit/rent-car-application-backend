package pl.sood.rentcarapplicationbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sood.rentcarapplicationbackend.model.*;
import pl.sood.rentcarapplicationbackend.repository.*;

import java.sql.Date;

@Component
public class Main {

    @Autowired
    public Main(CarMarkModelRepo carMarkModelRepo, CarRepo carRepo, AppUserRepo appUserRepo,
                CarClassRepo carClassRepo, RentalRepo rentalRepo, EmployeeRepo employeeRepo, CustomerRepo customerRepo) {
        ////////////////////////////////////////////////


    }
}
