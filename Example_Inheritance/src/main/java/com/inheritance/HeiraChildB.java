package com.inheritance;

public class HeiraChildB extends HeiraParentA {
	public  void subs() {
		int subs=b-a;
		System.out.println("Difference is"+subs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HeiraChildB cb=new HeiraChildB();
 cb.add();
 cb.subs();
	}

}
