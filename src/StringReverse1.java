
public class StringReverse1 {

	public static void main(String[] args) {
		String str="java is programing language";
		
		String str1[] =str.split("\\s");
		String s3="";
		for (int i = 0; i < str1.length; i++) {
			String s1="",s2="";
			System.out.println(str1[i]);
			s1=str1[i];
			for (int j = s1.length()-1; j>=0; j--) {
				s2=s2+s1.charAt(j);
			}
			s3=s3+s2+" ";
		}
		System.out.println(s3);
	}
}
