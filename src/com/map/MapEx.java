package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

public class MapEx {
 
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "ashvin");
		map.put(2, "ram");
		map.put(3, "vikas");
		map.put(4, "ashvin");
		
		Map<Integer, Employee> map2=new HashMap<>();
		map2.put(1, new Employee(101, "ashvin"));
		map2.put(2, new Employee(102, "himanshu"));
		map2.put(3, new Employee(103, "vikas"));
		map2.put(4, new Employee(104, "ram"));
		map2.put(5, new Employee(104, null));
		
		map.forEach((key,value)-> System.out.println(key+" "+value));
		
		map2.forEach((key,value)-> System.out.println(key+" "+value.getId()+" "+value.getName()));
		
		Set s=map2.keySet();
		System.out.println(s);
		
		boolean b=map2.containsValue(new Employee(104, "ram"));
		System.out.println(b);

	}
}
