package com.contribuintes.application;

import com.contribuintes.entities.Company;
import com.contribuintes.entities.Individual;
import com.contribuintes.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Person> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayersNumber = Integer.parseInt(input.nextLine());
        System.out.println();

        for (int i = 0; i < taxPayersNumber; i++) {
            System.out.printf("Tax payer #%d data:",i+1);
            System.out.print("Individual or company  (i/c): ");
            char choose = input.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Annual Income: ");
            double annualIncome = Double.parseDouble(input.nextLine());

            if(choose == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = Double.parseDouble(input.nextLine());
                taxPayers.add(new Individual(name,annualIncome,healthExpenditures));

            }
            if(choose == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = Integer.parseInt(input.nextLine());
                taxPayers.add(new Company(name,annualIncome,numberOfEmployees));

            }
        }

        System.out.println();
        System.out.println("TAXES PAID");
        System.out.println();

        double totalPaxes = 0.0;
        for(Person taxpayer : taxPayers){
            System.out.println(taxpayer.getName() +": $ " + String.format("%.2f",taxpayer.taxPaid()));
            totalPaxes += taxpayer.taxPaid();
        }

        System.out.println("TOTAL TAXES: $ "+String.format("%.2f",totalPaxes));

        input.close();

    }
}
