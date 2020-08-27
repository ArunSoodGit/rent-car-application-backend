package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Wypożyczenie")
public class Rental {

    @Id
    @Column(name = "id_wypożyczenia")
    private int id;
    @Column(name = "data_wypożyczenia")
    private Date rentalDate;
    @Column(name = "data_zwrotu")
    private Date returnDate;

    @ManyToOne
    private Car car;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Rental(Date rentalDate, Date returnDate) {
        this.id = id;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Rental() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
