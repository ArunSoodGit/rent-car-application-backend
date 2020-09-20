package pl.sood.rentcarapplicationbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sood.rentcarapplicationbackend.model.Car;
import pl.sood.rentcarapplicationbackend.model.CarClass;
import pl.sood.rentcarapplicationbackend.model.CarMarkModel;
import pl.sood.rentcarapplicationbackend.repository.CarClassRepo;
import pl.sood.rentcarapplicationbackend.repository.CarMarkModelRepo;
import pl.sood.rentcarapplicationbackend.repository.CarRepo;

@Service
public class CarService {

    private final CarRepo carRepo;
    private final CarClassRepo carClassRepo;
    private final CarMarkModelRepo carMarkModelRepo;

    @Autowired
    public CarService(CarRepo carRepo, CarClassRepo carClassRepo, CarMarkModelRepo carMarkModelRepo) {

        this.carRepo = carRepo;
        this.carClassRepo = carClassRepo;
        this.carMarkModelRepo = carMarkModelRepo;
    }

    public void addCar(Car car) {

        CarClass carClass = carClassRepo.findById(car.getCarMarkModel().getCarClass().getClassName()).orElse(null);
        carClassRepo.save(carClass);

        CarMarkModel carMarkModel = new CarMarkModel(car.getCarMarkModel().getMark(), car.getCarMarkModel().getModel());
        carMarkModel.setCarClass(carClass);
        carMarkModelRepo.save(carMarkModel);

        Car carToSave = new Car(car.getVin(), car.getRegistrationNumber(), car.getMileage(), car.getColor(), car.getEngineCapacity(),
                car.getReview(), car.getIsAvailable(), car.getDateOfProduction(), car.getImagePath());

        carToSave.setCarMarkModel(carMarkModel);
        System.out.println(carToSave);
        carRepo.save(carToSave);

    }

    public void delete(String vin) {
        carRepo.deleteById(vin);
    }
}
