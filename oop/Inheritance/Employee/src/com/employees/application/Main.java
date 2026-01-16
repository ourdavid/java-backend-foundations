package com.employees.application;

import com.employees.entities.Employee;
import com.employees.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int employeesNumber = Integer.parseInt(input.nextLine());
        System.out.println();

        for (int i = 1; i < employeesNumber+1; i++) {
            System.out.printf("Employee %d data: %n",i );
            System.out.print("Outsourced (y/n)? ");
            char isOutSourced = input.nextLine().charAt(0);
            System.out.print("Name; ");
            String name = input.nextLine();
            System.out.print("Hours; ");
            int hours = Integer.parseInt(input.nextLine());
            System.out.print("Value per hour: ");
            double valuePerHour = Double.parseDouble(input.nextLine());

            if(isOutSourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = Double.parseDouble(input.nextLine());
                employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }else {
                employees.add(new Employee(name,hours,valuePerHour));
            }

        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee employee : employees){
            System.out.printf("%s - $ %.2f%n",employee.getName(),employee.payment());
        }

        input.close();
    }
}
