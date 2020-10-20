package pl.sood.rentcarapplicationbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.CarClass;
import pl.sood.rentcarapplicationbackend.model.CarMarkModel;
import pl.sood.rentcarapplicationbackend.model.Rental;
import pl.sood.rentcarapplicationbackend.repository.CarRepo;
import pl.sood.rentcarapplicationbackend.repository.RentalRepo;

@Service
public class RentalsService {

    private final RentalRepo rentalRepo;

    @Autowired
    public RentalsService(RentalRepo rentalRepo) {
        this.rentalRepo = rentalRepo;
    }

    public void addRental(Rental rental) {



    }
}
