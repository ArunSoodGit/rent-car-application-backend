package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sood.rentcarapplicationbackend.model.CarClass;

@Repository
public interface CarClassRepo extends JpaRepository<CarClass, String> {
}
