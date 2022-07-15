import java.util.Random;
import java.util.stream.Stream;

// stream with forchEach loop

public class StreamExample1 {
 public static void main(String[] args) {
	 
	 Integer arr[]= {1,2,3,1,5,3,5,6,8,6,9,5};
	 
	 Stream<Integer> list= Stream.of(arr);
	 list.forEach(a-> System.out.println(a));
	 
	 
	 // get rendom 20 number within 100
	 Stream<Integer> randomNumbers = Stream
		      .generate(() -> (new Random()).nextInt(100));

		randomNumbers.limit(20).forEach(System.out::println);
	
}
}
