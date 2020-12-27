package pl.sood.rentcarapplicationbackend.model;



import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name = "vehicle" )
public class Car {

    @Id
    @Column(name = "Vin")
    private String vin;
    @Column(name = "Registration_Number")
    private String registrationNumber;
    @Column(name = "Mileage")
    private int mileage;
    @Column(name = "Color")
    private String color;
    @Column(name = "Engine_Capacity")
    private int engineCapacity;
    @Column(name = "Review")
    private Date review;
    @Type(type="yes_no")
    @Column(name = "Is_Available")
    private Boolean isAvailable;
    @Column(name = "Date_Of_Production")
    private Date dateOfProduction;
    @Column(name = "Image_Path")
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @ManyToOne( cascade = CascadeType.ALL)
    private CarMarkModel carMarkModel;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

    public Car(String vin, String registrationNumber, int mileage, String color, int engineCapacity, Date review, boolean isAvailable, Date dateOfProduction, String imagePath) {
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

    public Date getReview() {
        return review;
    }

    public void setReview(Date review) {
        this.review = review;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}
