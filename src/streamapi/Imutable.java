package streamapi;


public class Imutable {
	public static void main(String[] args) {
		Integer i=new Integer(10);
		  //System.out.println(i);
		  
		  String s="abc";
		  s="bcd";
		  s.concat("td");
		  System.out.println(s);
		  
		  //Integer i = new Integer(12);
		  
	        // Printing the same integer value
	        System.out.println(i);
	 
	        // Calling method 2
	       i=modify(i);
	 
	        // Now printing the value stored in above integer
	        System.out.println(i);
	    }
	  // Method 2
    // To modify integer value
    private static int modify(Integer i)
    { 
    	return i = i + 1;
    	 //System.out.println(i);
    }
	}
  
 
