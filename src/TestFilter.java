import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Emp
{
	private String name;
	private int id;
	private float salart;
	
	public Emp(String name, int id, float salart) {
		super();
		this.name = name;
		this.id = id;
		this.salart = salart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalart() {
		return salart;
	}
	public void setSalart(float salart) {
		this.salart = salart;
	}
	
	
}

public class TestFilter {
    public static void main(String[] args) {
    	ArrayList<Emp> list=new ArrayList<Emp>();
    	list.add(new Emp("ashvin", 1, 5000.0f));
    	list.add(new Emp("ram", 2, 4000.0f));
    	list.add(new Emp("shayam", 3, 1000.0f));
    	list.add(new Emp("vimal", 4, 3000.0f));
    	list.add(new Emp("nirmal", 5, 2200.0f));
    	list.add(new Emp("ashvin", 6, 2300.0f));
    	
    	ArrayList<Emp> al=(ArrayList<Emp>) list.stream().filter(p-> p.getSalart()>2000).collect(Collectors.toList());
    	al.forEach(a-> System.out.println(a.getName()+" "+a.getId()+" "+a.getSalart()));
    	
	}
}
