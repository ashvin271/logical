package com.test;

public class Test {
  public static void main(String[] args) {
	
	  SingleTon s= SingleTon.getObject();
	  SingleTon s1= SingleTon.getObject();
	  System.out.println(s.hashCode());
	  System.out.println(s1.hashCode());
}
}
