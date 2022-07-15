package collectionex;

import java.util.Scanner;

public class LogicalEX {
	
	public static void main(String[] args) {
		 System.out.println("enter number:-");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		for(int i = 1; i <= num; i++)
	    {
	        if(num % i == 0)
	        	if(num!=i) {
	        		System.out.println(i + " ");
	        	}
	    }
	}
}
