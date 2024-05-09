package com.inheritance;

public class Child extends Parent{
 public void substract() {
	 int subs=b-a;
	 System.out.println("Difference is" +subs);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();//creates the object first
		ch.add();//checks whether this method is there in the class if not
		ch.substract();
	}

}
