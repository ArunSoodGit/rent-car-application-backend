package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sood.rentcarapplicationbackend.model.CarMarkModel;

@Repository
public interface CarMarkModelRepo extends JpaRepository<CarMarkModel, Integer> {
}
