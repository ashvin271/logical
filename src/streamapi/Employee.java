package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Employee {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<>();
		list.add(new Student(1, "ashvin",5000f));
		list.add(new Student(2, "aayush",2000f));
		list.add(new Student(3, "ram",3000f));
		list.add(new Student(4, "shayam",4000f));
		list.add(new Student(5, "lokesh",5000f));
		list.add(new Student(6, "pravin",1000f));
		list.add(new Student(1, "ashvin",6000f));
		
		// list start with ashvin
		List<Student>list2=list.stream().filter(p->p.getName().equals("ashvin")).collect(Collectors.toList());
		System.out.println(list2);
		
		//get unique
		Set<Student>list3=list.stream().collect(Collectors.toSet());
		System.out.println(list3);
		
		//list count
		long count=list.stream().filter((s)->s.getName().startsWith("a")).count();
		System.out.println(count);
		
		//get average salary
				OptionalDouble salary=list.stream().mapToDouble(Student :: getSalary).average();
				System.out.println(salary);
				
	   // sum salary
		double sumsalary=	list.stream().mapToDouble(Student:: getSalary).sum();
		System.out.println(sumsalary);
		
		// sum salary
		List<Student> st=list.stream().filter(p-> p.getSalary()>1000.0).sorted((s,s1)->s.getName().compareTo(s1.getName())).limit(1).collect(Collectors.toList());
		System.out.println(st);	
		
		//reduce
		 Float sumSal = list.stream()
			      .map(Student::getSalary)
			      .reduce((float) 0.0, Float::sum);
		 System.out.println(sumSal);
		 
		 // get name set
		 Set<String> empNames = list.stream()
		            .map(Student::getName)
		            .collect(Collectors.toSet());
		 System.out.println(empNames);
		 
		
			       
	}
}

class Student{
	
	private int id;
	private String name;
	private float salary;
	
	
	public Student(int id, String name,float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary= salary;
	}
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
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (""+id+name+salary).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		if(this.id==s.id) {
			return true;
		}else {
			return false;
		}
	}
	
}