package com.employee;

public class Child2 extends Parent1 {
	 public Child2() {
	        super(); 
	    }
	
    public static void main(String[] args) {
        Child1 c1 = new Child1(); 
        double hra1 = c1.calculateHRA();
        double pf1 = c1.calculatePf();
        double totalSal = c1.basicPay + hra1 - pf1 - c1.deduction + c1.bonus;
        
        System.out.println("\n Salary Slip");
        System.out.println(" ___________");
        System.out.println("\n Basic Pay : " + c1.basicPay);
        System.out.println("\n Deduction : " + c1.deduction);
        System.out.println("\n HRA : " + hra1);
        System.out.println("\n PF : " + pf1);
        System.out.println("\n Bonus : " + c1.bonus);
        System.out.println("\n Salary In Hand : " + totalSal);
    }
}
