package pl.sood.rentcarapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sood.rentcarapplicationbackend.model.CarClass;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarClassRepo extends JpaRepository<CarClass, String> {

    @Override
    Optional<CarClass> findById(String s);


    List<CarClass> findAllByClassName(String s);

}
