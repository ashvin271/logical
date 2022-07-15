import java.util.ArrayList;

public class Order {

public static void main(String[] args) {
	
	Integer arr[]= {1,2,3,7,5,6,9};
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	//assending
	
	int a=0;
	for (int i = 0; i < arr.length; i++) {
		 for (int j = i+1; j < arr.length; j++) {     
            if(arr[i] > arr[j]) {    
                a = arr[i];    
                arr[i] = arr[j];    
                arr[j] = a;    
            }   
		 }
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	//desecending
	for (int i = 0; i < arr.length; i++) {
		 for (int j = i+1; j < arr.length; j++) {     
           if(arr[i] < arr[j]) {    
               a = arr[i];    
               arr[i] = arr[j];    
               arr[j] = a;    
           }   
		 }
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}
}
