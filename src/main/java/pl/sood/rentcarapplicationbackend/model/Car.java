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
    private String review;
    @Column(name = "czy_dostępny")
    private String isAvailable;
    @Column(name = "rok_produkcji")
    private Date dateOfProduction;
    @Column(name = "ścieżk_do_zdjęcia")
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @ManyToOne
    private CarMarkModel carMarkModel;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
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

    public Car(String vin, String registrationNumber, int mileage, String color, int engineCapacity, String review, String isAvailable, Date dateOfProduction, String imagePath) {
        this.vin = vin;
        this.mileage = mileage;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.review = review;
        this.isAvailable = isAvailable;
        this.dateOfProduction = dateOfProduction;
        this.registrationNumber = registrationNumber;
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", review='" + review + '\'' +
                ", isAvailable='" + isAvailable + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", imagePath='" + imagePath + '\'' +
                ", carMarkModel=" + carMarkModel +
                '}';
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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}
