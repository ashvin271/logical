import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Employee{
   
	private int id;
	private String name;
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
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class RemoveDuplicateObjet {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "ashvin"));
		list.add(new Employee(102, "ram"));
		list.add(new Employee(103, "lakan"));
		list.add(new Employee(101, "aayush"));
	
		System.out.println("duplicate object "+list);
		
		Map<Integer, String> map=new HashMap<>();
		
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getId(), list.get(i).getName());
		}
		
		System.out.println("remove duplicate object "+map);
	}
}
