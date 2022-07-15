import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate {
public static void main(String[] args) {
	
	Integer arr[]= {1,2,3,1,5,3,5,6,8,6,9,5};
	Set<Integer> set=new HashSet<>();
	for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
	
	System.out.println(set);
	
	// by stream api  
	Stream<Integer> list= Stream.of(arr);
	
	List<Integer> unique=list.distinct().collect(Collectors.toList());
	
	System.out.println(unique);
}
   
}
