package streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {

	public static void main(String[] args) {
	
	// 1
	Stream<Object> empStream=Stream.empty();
	
	//2
	String name[]= {"ashvin","patidar","vishal","milan","renu"};
	Stream<String> names=Stream.of(name);
	
	//3
	Stream<Object> streambulider=Stream.builder().build();
	
	//4
    IntStream intstream=Arrays.stream(new int [] {1,2,5,4,8});
    intstream.forEach(e-> System.out.println(e));
	}
}
