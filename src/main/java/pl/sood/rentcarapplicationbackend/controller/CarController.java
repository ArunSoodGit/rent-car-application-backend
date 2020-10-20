package pl.sood.rentcarapplicationbackend.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.CarClass;
import pl.sood.rentcarapplicationbackend.model.CarMarkModel;
import pl.sood.rentcarapplicationbackend.repository.CarClassRepo;
import pl.sood.rentcarapplicationbackend.repository.CarMarkModelRepo;
import pl.sood.rentcarapplicationbackend.repository.CarRepo;
import pl.sood.rentcarapplicationbackend.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class CarController {

    private final CarRepo carRepo;

    private final CarService carService;


    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    @GetMapping("/available-cars")
    public List<Car> getAvailableCars() {
        return carRepo.findAll().stream().filter(car -> (car.getIsAvailable()).equals("dostępny")).collect(Collectors.toList());
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car) {

       carService.addCar(car);
    }

    @PutMapping("/cars")
    public void updateCar(@RequestBody Car car) {

        carService.addCar(car);
    }
    @DeleteMapping("/cars/{vin}")
    public void deleteCar(@PathVariable String vin) {
        carService.delete(vin);
    }
}
