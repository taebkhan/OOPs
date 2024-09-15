package org.example;

import java.util.ArrayList;
import java.util.List;

public class ObjectListDemo {
    List<Employee> employeeList = new ArrayList<>();

    public void Demo(){
        employeeList.add(new Employee("Raj", "Delhi"));
        employeeList.add(new Employee("Rajesh", "Lucknow"));
        employeeList.add(new Employee("Tushar", "Jammu"));
        employeeList.add(new Employee("Harsh", "Delhi"));
        employeeList.add(new Employee("Amit", "Chennai"));
        employeeList.add(new Employee("Harish", "Bengaluru"));
        employeeList.add(new Employee("Aslam", "Bhopal"));

        Integer count = 0;
        for (Employee employee : employeeList){
            if(employee.getCity() == "Delhi"){
                count = count + 1;
            }
        }
        System.out.println("Number of employees living in Delhi: " + count);
    }
}
