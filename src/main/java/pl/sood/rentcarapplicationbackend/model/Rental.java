package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Rental_ID")
    private int id;
    @Column(name = "Rental_Date")
    private Date rentalDate;
    @Column(name = "Return_Date")
    private Date returnDate;
    @Column(name = "Status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Column(name = "Rental_Cost")
    private double rentalCost;
    @ManyToOne
    private Car car;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "rental", cascade = CascadeType.ALL)
    Set<File> files;


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
