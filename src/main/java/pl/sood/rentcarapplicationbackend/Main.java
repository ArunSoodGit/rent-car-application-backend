package pl.sood.rentcarapplicationbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sood.rentcarapplicationbackend.model.*;
import pl.sood.rentcarapplicationbackend.repository.*;

import java.sql.Date;

@Component
public class Main {

    @Autowired
    public Main(CarMarkModelRepo carMarkModelRepo, CarRepo carRepo, AppUserRepo appUserRepo,
                CarClassRepo carClassRepo, RentalRepo rentalRepo, EmployeeRepo employeeRepo, CustomerRepo customerRepo) {
        ////////////////////////////////////////////////

        CarClass carClassA = new CarClass("A", 79, 950);
        carClassRepo.save(carClassA);

        CarClass carClassB = new CarClass("B", 179, 1560);
        carClassRepo.save(carClassB);


        CarClass carClassC = new CarClass("C", 239, 1900);
        carClassRepo.save(carClassC);

        CarClass carClassD = new CarClass("D", 329, 2400);
        carClassRepo.save(carClassD);


        ////////////////////////////////////////////////
        CarMarkModel carMarkModel = new CarMarkModel("Seat", "Ibiza");
        carMarkModel.setCarClass(carClassB);
        carMarkModelRepo.save(carMarkModel);

        CarMarkModel carMarkModel2 = new CarMarkModel("Renault", "Megane");
        carMarkModel2.setCarClass(carClassC);
        carMarkModelRepo.save(carMarkModel2);

        ////////////////////////////////////////////////

        Car car = new Car("VNN978SD9", "SK182PH", 12000, "white", 1500, "Tak", "dostępny", new Date(2019 - 1900, 2, 23),"https://raw.githubusercontent.com/ArunSoodGit/rent-car/master/src/assets/img/ibiza.png");
        car.setCarMarkModel(carMarkModel);
        carRepo.save(car);

        Car car2 = new Car("VNN9DSD324", "SK34322", 3430, "red", 1300, "Tak", "wynajęty", new Date(2012 - 1900, 4, 22),"https://raw.githubusercontent.com/ArunSoodGit/rent-car/master/src/assets/img/megane.png");
        car2.setCarMarkModel(carMarkModel2);
        carRepo.save(car2);

        ////////////////////////////////////////////////
        AppUser appUser = new AppUser("admin", "$2a$10$kPFto/iuD4p.cBJRdkbp9uwUjzbLo6DwJP.AVFPuqrqQTUdo1nfW2", "ADMIN");
        appUserRepo.save(appUser);

        ////////////////////////////////////////////////
        Employee employeeArun = new Employee("Arun", "Sood", 4200, 576015420);
        employeeRepo.save(employeeArun);
        ////////////////////////////////////////////////
        Customer customer = new Customer("123j123jb321","Bartosz","Kwec","Harcerska 10","Sosnowiec",879652430,"bartosz.kwec@o2.pl");

        customerRepo.save(customer);
        Rental rental = new Rental(new Date(2020 - 1900, 4, 22), new Date(2020 - 1900, 4, 29));
        rental.setCar(car);
        rental.setEmployee(employeeArun);
        rental.setCustomer(customer);
        rentalRepo.save(rental);
    }
}
