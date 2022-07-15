
class Test{
   int i;
   Test(){
	   i=10;
	   System.out.println("parent default constructor"+i);
   }
	static {
		System.out.println("static block parent");
	}
	{
		System.out.println("instance block parent");
	}
	public static void m1() {
		System.out.println("static method ");
	}
}
public class ThisSuper {
	int s;
	ThisSuper(){
		super();
		System.out.println("child class constructor child "+this.s);
	}
	{
		s=50;
		System.out.println("child sib block child "+this.s);
	}
	static {
		System.out.println("static child");
	}
  public static void main(String[] args) {
	  ThisSuper ThisSuper=new ThisSuper();
	  Test.m1();
	  Test t=new Test();
}
}
