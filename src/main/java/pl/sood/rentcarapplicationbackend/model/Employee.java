package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Pracownik")
public class Employee {

    @Id
    @Column(name = "nr_pracownika")
    private int employeeNumber;
    @Column(name = "imię_pracownika")
    private String employeeName;
    @Column(name = "nazwisko_pracownika")
    private String employeeSurname;
    @Column(name = "pensja")
    private int salary;
    @Column(name = "nr_telefonu")
    private int phoneNumber;
    @OneToMany(mappedBy = "employee")
    Set<Rental> rentals;

    public Employee() {
    }

    public Employee(String employeeName, String employeeSurname, int salary, int phoneNumber) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
