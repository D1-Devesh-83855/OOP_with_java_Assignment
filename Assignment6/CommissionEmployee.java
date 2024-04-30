package com.sunbeam.app;
public class CommissionEmployee extends Employee {
     double sales;
     double commissionRate;

    public CommissionEmployee(String name, double sales, double commissionRate) {
        super(name);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public void calculateEarnings() {
        this.earnings = sales * commissionRate;
    }
}