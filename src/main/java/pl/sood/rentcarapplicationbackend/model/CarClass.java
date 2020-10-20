package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "klasa")
public class CarClass {

    @Id
    @Column(name = "nazwa_klasy")
    private String className;
    private int pricePerNight;
    private int deposit;


    @OneToMany(mappedBy = "carClass")
    Set<CarMarkModel> carMarkModels;

    public CarClass(String className, int pricePerNight, int deposit) {
        this.className = className;
        this.pricePerNight = pricePerNight;
        this.deposit = deposit;
    }

    public CarClass() {
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "className='" + className + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", deposit=" + deposit +
                '}';
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
