import java.util.function.BiFunction;
//constructor

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
} 

// for instans method
interface Complete{
	public void say();
}

public class MethRefrenceEx {
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public void saySomething(){  
	        System.out.println("Hello, this is non-static method.");  
	}  
	
	public static void main(String[] args) {
		// static method refrence
		BiFunction<Integer,Integer,Integer> s=MethRefrenceEx::sum;
		 System.out.println(s.apply(1, 2));
		 
		 //instance method refrence
		 MethRefrenceEx methex=new MethRefrenceEx();
		 Complete c= methex::saySomething;
		 c.say();
		 
		 //constructor
		 Messageable m=Message::new;
		 m.getMessage("java");
		 
	}

}
