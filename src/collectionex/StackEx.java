package collectionex;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		//System.out.println(stack);
		stack.pop();  
		System.out.println(stack);
		System.out.println(stack.peek());
	}
}
