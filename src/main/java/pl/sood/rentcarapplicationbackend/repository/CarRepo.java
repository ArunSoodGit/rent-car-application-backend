package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sood.rentcarapplicationbackend.model.AppUser;
import pl.sood.rentcarapplicationbackend.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, String> {
}
