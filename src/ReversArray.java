import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversArray {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5,6,7};
		
	
		for (int i=arr.length-1; i>=0; i--) {
			System.out.println(i);
		}
		
		// by collections 
		
		List<Integer> al=Arrays.asList(arr);
		Collections.reverse(al);
		System.out.print(al);
	}
	
	
	
}
