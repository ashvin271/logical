import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaximumNumber {

  public static void main(String[] args) {
	  List<Integer> list = new ArrayList<Integer>();
		 
		for(int i = 1; i<=10; i++){
		      list.add(i);
		}
		
		int a=list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(a<list.get(i)) {
				a=list.get(i);
			}
			
		}
		System.out.println(a);
		
		// by stream api 
		
		Stream<Integer> stream=list.stream();
		Optional<Integer> max=stream.max((i,j)->i.compareTo(j));
		System.out.println(max.get());
		
  }
}
