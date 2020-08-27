package pl.sood.rentcarapplicationbackend.model;



import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name = "Egzemplarz" )
public class Car {

    @Id
    @Column(name = "vin")
    private String vin;
    @Column(name = "nr_rejestracyjny")
    private String registrationNumber;
    @Column(name = "przebieg")
    private int mileage;
    @Column(name = "kolor")
    private String color;
    @Column(name = "pojemność_silnika")
    private int engineCapacity;
    @Column(name = "przegląd")
    private char review;
    @Column(name = "czy_dostępny")
    private char isAvailable;
    @Column(name = "rok_produkcji")
    private Date dateOfProduction;

    @ManyToOne
    private CarMarkModel carMarkModel;

    @OneToMany(mappedBy = "car")
    Set<Rental> rentals;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public CarMarkModel getCarMarkModel() {
        return carMarkModel;
    }

    public void setCarMarkModel(CarMarkModel carMarkModel) {
        this.carMarkModel = carMarkModel;
    }

    public void setCarModel(CarMarkModel carMarkModel) {
        this.carMarkModel = carMarkModel;
    }

    public Car() {
    }

    public Car(String vin, String registrationNumber, int mileage, String color, int engineCapacity, char review, char isAvailable, Date dateOfProduction) {
        this.vin = vin;
        this.mileage = mileage;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.review = review;
        this.isAvailable = isAvailable;
        this.dateOfProduction = dateOfProduction;
        this.registrationNumber = registrationNumber;
    }



    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public char getReview() {
        return review;
    }

    public void setReview(char review) {
        this.review = review;
    }

    public char getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(char isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}
