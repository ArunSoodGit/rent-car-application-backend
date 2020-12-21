package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "Employee_Number")
    private long employeeNumber;
    @Column(name = "Employee_Name")
    private String employeeName;
    @Column(name = "Employee_Surname")
    private String employeeSurname;
    @Column(name = "Salary")
    private int salary;
    @Column(name = "Phone_Number")
    private int phoneNumber;
    @OneToMany(mappedBy = "employee")
    Set<Rental> rentals;

    @OneToOne(cascade=CascadeType.PERSIST, mappedBy = "employee")
    private AppUser appUser;

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }


    public Employee() {
    }

    public Employee(String employeeName, String employeeSurname, int salary, int phoneNumber) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
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
