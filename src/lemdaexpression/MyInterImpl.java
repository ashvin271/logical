package lemdaexpression;

public class MyInterImpl {

	public static void main(String[] args) {
		//using over interface help of lembda
		
		MyInter i=()->System.out.println("this is first time i am using lembda");
		
		i.hello();
		
		SumInter s=(a,b)->{
			 return a+b;
		};
		
		SumInter s2=(a,b)-> a+b;
		 
		System.out.println(s.sum(10, 20));
		System.out.println(s2.sum(100, 20));
		
		
		LengthInter len=(str)->str.length();
		
		System.out.println(len.lenth("ram"));
		
		}
}
