package collectionex;

import java.util.HashSet;

public class Test {
  public static void main(String[] args) {
	  int arr[] = {10, 20, 30, 40, 50, 20, 40, 30, 20, 40};
	  HashSet<Integer> set=new HashSet<>();
	 /// int[] intArray = new int[20];
	  
	  for (int i = 0; i < arr.length; i++) {
           int count=0;
		  for (int j = 1; j < arr.length; j++) {
		    if(arr[i]==arr[j]) {
		         count++;
		         if(count==3) {
		        	 set.add(arr[i]);
				    break;
				  }
		    }	
		    
		}
	   }
    System.out.println(set);
}
}
