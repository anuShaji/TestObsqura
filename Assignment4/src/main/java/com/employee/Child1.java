package com.employee;


public class Child1 extends Parent1 {
    public double hra;
    public double pf;

    public Child1() {
        super(); 
        this.hra = 0.05 * basicPay;
        this.pf = 0.20 * basicPay;
    }

    public double calculateHRA() {
        return hra;
    }

    public double calculatePf() {
        return pf;
    }
}



