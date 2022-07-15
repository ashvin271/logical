package collectionex;

public class Logic1 {
  public static void main(String[] args) {
	  int arr[]= {5,10,15,20,25,3,6,9,4,15};
	  int sumfirst=0;
	  int sumsecond=0;
	  for(int i=0;i<arr.length;i++){
	     if(arr[i]%5==0){
	        sumfirst=sumfirst+arr[i];
	     }
	     if(arr[i]%3==0){
	        sumsecond=sumsecond+arr[i];
	     }
	  } 
	  System.out.println(sumfirst);
	  System.out.println(sumsecond);
	  System.out.println(sumfirst-sumsecond);
}
}
