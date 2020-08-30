package pl.sood.rentcarapplicationbackend.controller;


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
public class CarController {

    private final CarRepo carRepo;
    private final CarClassRepo carClassRepo;
    private final CarMarkModelRepo carMarkModelRepo;
    private CarService carService;

    @Autowired
    public CarController(CarRepo carRepo, CarClassRepo carClassRepo, CarMarkModelRepo carMarkModelRepo, CarService carService) {
        this.carRepo = carRepo;
        this.carClassRepo = carClassRepo;
        this.carMarkModelRepo = carMarkModelRepo;
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    @GetMapping("/available-cars")
    public List<Car> getAvailableCars() {
        return carRepo.findAll().stream().filter(car -> (car.getIsAvailable()).equals("dostępny")).collect(Collectors.toList());
    }

    @GetMapping("/marks")
    public List<CarMarkModel> getAllMarks() {
        return carMarkModelRepo.findAll();
    }

    @GetMapping("/classes")
    public List<CarClass> getAllClasses() {
        return carClassRepo.findAll();
    }


    @PostMapping("/add-car")
    public String addCar(@RequestBody Car car) {

        carService.addCar(car);
        return "test";
    }

    @PutMapping("/update-car")
    public String updateCar(@RequestBody Car car) {

        carService.addCar(car);
        return "test";
    }
}
