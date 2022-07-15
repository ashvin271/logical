import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToList {
 public static void main(String[] args) {
	String s="12345";
	String str[]=s.split("\\B");
	List<String> l1 = Arrays.asList(str);
	System.out.println(l1);
	List<Integer> al=l1.stream().map(a->Integer.valueOf(a)).collect(Collectors.toList());
	System.out.println(al);
}
}
