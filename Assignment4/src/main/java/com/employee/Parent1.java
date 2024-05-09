package com.employee;
import java.util.Scanner;

public class Parent1 {
    protected double basicPay;
    protected double deduction;
    protected double bonus;

    public Parent1() {
       
        Scanner scanner = new Scanner(System.in);
        // Take input for basic pay
        System.out.print("Enter basic pay: ");
        this.basicPay = scanner.nextDouble();
        // Take input for deduction
        System.out.print("Enter deduction: ");
        this.deduction = scanner.nextDouble();
        // Take input for bonus
        System.out.print("Enter bonus: ");
        this.bonus = scanner.nextDouble();
        // Close the Scanner object
        scanner.close();
    }

    public Parent1(double basicPay, double deduction, double bonus) {
        this.basicPay = basicPay;
        this.bonus = bonus;
        this.deduction = deduction;
    }
}
