
public class Recursion {

	public static void reverse(char str[], int k)
    {
        // base case: end of the string is reached
        if (k == str.length) {
            return;
        }
 
        // recur for the next character
        reverse(str, k + 1);
 
        // print current character
        System.out.print(str[k]);
    }
 
    public static void main (String[] args)
    {
        char str[] = "ashvin patidar".toCharArray();
        reverse(str, 0);
    }
}
