package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sood.rentcarapplicationbackend.model.Rental;

@Repository
public interface RentalRepo extends JpaRepository<Rental,Integer> {
}
