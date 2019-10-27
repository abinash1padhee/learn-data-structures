package com.abinash.data.structures;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.set(0, new Employee("John", "Adams", 4567));

        Employee[] empArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : empArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 22)));

        // System.out.println(employeeList);


    }
}
