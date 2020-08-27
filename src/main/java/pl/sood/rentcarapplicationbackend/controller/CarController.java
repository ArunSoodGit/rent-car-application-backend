package pl.sood.rentcarapplicationbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.CarClass;
import pl.sood.rentcarapplicationbackend.model.CarMarkModel;
import pl.sood.rentcarapplicationbackend.repository.CarClassRepo;
import pl.sood.rentcarapplicationbackend.repository.CarMarkModelRepo;
import pl.sood.rentcarapplicationbackend.repository.CarRepo;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CarController {

    private final CarRepo carRepo;
    private final CarClassRepo carClassRepo;
    private final CarMarkModelRepo carMarkModelRepo;

    @Autowired
    public CarController(CarRepo carRepo, CarClassRepo carClassRepo, CarMarkModelRepo carMarkModelRepo) {
        this.carRepo = carRepo;
        this.carClassRepo = carClassRepo;
        this.carMarkModelRepo = carMarkModelRepo;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return carRepo.findAll();
    }

    @GetMapping("/marks")
    public List<CarMarkModel> getAllMarks(){
        return carMarkModelRepo.findAll();
    }

    @GetMapping("/classes")
    public List<CarClass> getAllClasses(){
        return carClassRepo.findAll();
    }
}
