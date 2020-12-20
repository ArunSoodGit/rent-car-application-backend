package pl.sood.rentcarapplicationbackend.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.repository.CarRepo;
import pl.sood.rentcarapplicationbackend.service.CarService;

import java.util.List;

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

    @GetMapping("/cars/{vin}")
    public Car getCarByVin(@PathVariable String vin) {
        return carRepo.findById(vin).orElseThrow(RuntimeException::new);
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
