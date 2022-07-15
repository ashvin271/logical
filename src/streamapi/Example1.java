package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {

		// create and filter list imutable list

		List<Integer> list=List.of(2,4,50,21,22,67,2,4,8);
		System.out.println(list);


		//even number
		List<Integer> list2=list.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(list2);

		//odd number 
		List<Integer> list3=list.stream().filter(i-> i%2!=0).collect(Collectors.toList());
		System.out.println(list3);

		//max number
		Optional<Integer> max=list.stream().max((p,p1)->p.compareTo(p1));
		System.out.println(max);

		// min number 
		Optional<Integer> min=list.stream().min((p,p2)->p.compareTo(p2));
		System.out.println(min);

		//uniqe number
		List<Integer> list4=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list4);

		// sorted descending
		List<Integer> list5=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list5);

		// sorted ascending
		List<Integer> list6=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(list6);

		//count
		int number=(int) list.stream().parallel().count();
		System.out.println("count==="+number);

		//generate random number
		Stream<Integer> randomNumbers = Stream
				.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(5).forEach(System.out::println);


		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		//upper case start with A
		memberNames.stream().filter((s) -> s.startsWith("A"))
		.map(String::toUpperCase)
		.forEach(System.out::println);

		// match start with A
		boolean matchedResult = memberNames.stream()
				.anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		// count

		long totalMatched = memberNames.stream()
				.filter((s) -> s.startsWith("A"))
				.count();

		System.out.println(totalMatched); 

		// reduce

		Optional<String> reduced = memberNames.stream()
				.reduce((s1,s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);

		// startWith L and First

		String firstMatchedName = memberNames.stream()
				.filter((s) -> s.startsWith("L"))
				.findFirst()
				.get();

		System.out.println(firstMatchedName); 
		
		// if condition
		
		ArrayList<Integer> numberList  = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

	Consumer<Integer> action = i -> {
	    if (i % 2 == 0) {
	        System.out.println("Even number :: " + i); //Or any other user action we want to do
	    } else {
	        System.out.println("Odd  number :: " + i);  //Or any other user action we want to do
	    }
	};

	numberList.stream()
	    .forEach(action);
	
	
	// average
		double avg = IntStream.of(1, 2, 3, 4, 5)
				  .average()
				  .getAsDouble();
		System.out.println(avg);
	
		//sum given rang
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);
	}

}
