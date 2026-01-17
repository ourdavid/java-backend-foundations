package com.contribuintes.entities;

public class Individual extends Person {
    double healthcareExpenses;

    public Individual(String name, double annualIncome, double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double taxPaid() {

        double basicTax;
        if(getAnnualIncome() < 20000){
           basicTax = getAnnualIncome() * 0.15;
        }else {
           basicTax = getAnnualIncome() * 0.25;
        }
        basicTax -= getHealthcareExpenses() * 0.5;

        if(basicTax < 0.0){
            basicTax = 0.0;
        }

        return basicTax;
    }
}
