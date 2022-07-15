import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		LinkedList<Integer> al2=new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		for (int i=al.size()-1; i>=0; i--) {
			al2.add(al.get(i));
		}
		System.out.println(al2);
		Collections.reverse(al);
		System.out.println(al);
	}
}
