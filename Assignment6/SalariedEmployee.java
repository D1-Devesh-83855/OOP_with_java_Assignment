package com.sunbeam.app;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void calculateEarnings() {
        this.earnings = weeklySalary;
    }
}