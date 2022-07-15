import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderByList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("9", "A", "Z", "c", "B", "Y", "4", "a", "1");
		
		
		List<String> sortedList = list.stream()
			.sorted(Comparator.naturalOrder())
			.collect(Collectors.toList());
			
			/*
			 * List<String> sortedList = list.stream() .sorted((o1,o2)-> o1.compareTo(o2))
			 * .collect(Collectors.toList())
			 */;
		

		//List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		
        sortedList.forEach(System.out::println);
        
        Collections.reverse(sortedList);
        sortedList.forEach(System.out::println);
	}
}
