package com.sunbeam.app;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateEarnings() {
        if (hoursWorked > 40) {
            this.earnings = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
        } else {
            this.earnings = hoursWorked * hourlyRate;
        }
    }
}