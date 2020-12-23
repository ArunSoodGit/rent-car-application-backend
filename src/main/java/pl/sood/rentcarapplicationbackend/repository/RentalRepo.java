package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sood.rentcarapplicationbackend.model.Customer;
import pl.sood.rentcarapplicationbackend.model.Rental;

import java.util.List;

@Repository
public interface RentalRepo extends JpaRepository<Rental,Integer> {


    List<Rental> findAllByCustomer(Customer customer);
}
