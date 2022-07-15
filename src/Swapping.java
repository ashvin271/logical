
public class Swapping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=0;
		
		c=a;
		a=b;
		b=c;
		System.out.println("a=="+a+" b=="+b);
		
		 a=10;
		 b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=="+a+" b=="+b);
	}
	

}
