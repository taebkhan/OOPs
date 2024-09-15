package org.example;


public class Employee{
    private String empName;
    private String empCity;

    public Employee(String name, String city){
        this.empName = name;
        this.empCity = city;
    }

    public String getName() {
        return empName;
    }

    public String getCity() {
        return empCity;
    }
}