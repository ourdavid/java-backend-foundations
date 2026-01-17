package com.contribuintes.entities;

public class Company extends Person {
    private int employees;

    public Company(String name, double annualIncome, int employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double taxPaid() {
        if(employees > 10){
            return (getAnnualIncome()*0.14);
        }else {
            return (getAnnualIncome()*0.16);
        }
    }
}
