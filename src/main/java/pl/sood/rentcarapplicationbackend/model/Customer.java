package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "Driver_License_Number")
    private String driverLicenseNumber;
    @Column(name = "Customer_Name")
    private String customerName;
    @Column(name = "Customer_Surname")
    private String customerSurname;
    @Column(name = "Address")
    private String address;
    @Column(name = "City_name")
    private String cityName;
    @Column(name = "Country")
    private String country;
    @Column(name = "Phone_Number")
    private int phoneNumber;
    @Column(name = "Email")
    private String email;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<Rental> rentals;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Customer() {
    }

    public Customer(String driverLicenseNumber, String customerName, String customerSurname, String address, String cityName, int phoneNumber, String email, String country) {
        this.driverLicenseNumber = driverLicenseNumber;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.address = address;
        this.cityName = cityName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.country = country;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
