package com.inheritance;

public class HeiraChildC extends HeiraParentA{
	public  void mul(){
		int mul=a*b;
		System.out.println("sum is"+mul);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeiraChildC cb=new HeiraChildC();
		 cb.add();
		 cb.mul();
	}
}
