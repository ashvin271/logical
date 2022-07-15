package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student12{
	
	private int id;
	private String name;
	private List<Address12> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address12> getAddress() {
		return address;
	}
	public void setAddress(List<Address12> address) {
		this.address = address;
	}
	public Student12(int id, String name, List<Address12> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
}

class  Address12{
	
	private int id;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address12(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address12 [id=" + id + ", city=" + city + "]";
	}
	
	
	
}

public class Example {

	public static void main(String[] args) {
		ArrayList<Student12> list=new ArrayList<>();
		ArrayList<Address12> addresss=new ArrayList<Address12>();
		addresss.add(new Address12(1, "indore"));
		addresss.add(new Address12(2, "ujjain"));
		addresss.add(new Address12(3, "khargone"));
		addresss.add(new Address12(4, "bhopal"));
		addresss.add(new Address12(5, "indore"));
		addresss.add(new Address12(6, "oon"));
		
		list.add(new Student12(1, "ashvin", addresss));
		
		ArrayList<Address12> list1= (ArrayList<Address12>) addresss.stream().filter(add-> add.getCity().equals("indore")).collect(Collectors.toList());
		System.out.println(list1);
		
	}
}
