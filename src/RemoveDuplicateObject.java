import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveDuplicateObject {

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
		return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
	
	public static void main(String[] args) {
     
		ArrayList<Student> list=new ArrayList<>();
		ArrayList<Student> list2=new ArrayList<>();
		list.add(new Student("ashvin", 10));
		list.add(new Student("ram", 9));
		list.add(new Student("shayam", 11));
		list.add(new Student("ashvin", 10));
		list.add(new Student("ashvin", 12));
		
		list2.addAll(list);
		
		ArrayList<Student> stlist=(ArrayList<Student>) list.stream().filter(distinctByKey(cust -> cust.getAge()))
				.collect(Collectors.toList());
	
		stlist.forEach(std-> System.out.println(std.getAge()+" "+std.getName()));
		
		
		
		
	}
	
}

class Student{
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(s.getAge()==age) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}