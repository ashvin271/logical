package com.stream;

import java.util.ArrayList;

public class AllMatchMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		boolean al2=al.stream().allMatch(p-> p>=10);
		System.out.println(al2);
		
		boolean al3=al.stream().anyMatch(p-> p>10);
		System.out.println(al3);
		
		boolean al4=al.stream().noneMatch(p->p==10);
		System.out.println(al4);
	}

	
}
