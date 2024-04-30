package com.sunbeam.app;

public class BaseSalariedCommissionemployee extends CommissionEmployee {
    private double baseSalary;

    public BaseSalariedCommissionemployee(String name, double sales, double commissionRate, double baseSalary) {
        super(name, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public void calculateEarnings() {
        this.earnings = baseSalary + (sales * commissionRate);
    }

    
    public void increaseBaseSalary() {
        baseSalary *= 1.10;
    }
}