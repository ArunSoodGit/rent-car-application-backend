package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "klient")
public class Customer {
    @Id
    @Column(name = "nr_prawa_jazdy")
    private String driverLicenseNumber;
    @Column(name = "imię_klienta")
    private String customerName;
    @Column(name = "nazwisko_klienta")
    private String customerSurname;
    @Column(name = "adres_zamieszkania")
    private String address;
    @Column(name = "nazwa_miasta")
    private String cityName;
    @Column(name = "Kraj")
    private String country;
    @Column(name = "nr_telefonu_klienta")
    private int phoneNumber;
    @Column(name = "adres_email")
    private String email;
    @OneToMany(mappedBy = "customer")
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
