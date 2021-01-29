package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sood.rentcarapplicationbackend.model.Customer;
import pl.sood.rentcarapplicationbackend.model.File;
import pl.sood.rentcarapplicationbackend.model.Rental;

import java.util.List;

public interface FileRepo extends JpaRepository<File, Long> {

    List<File> findAllByRentalId(int rentalId);
}
