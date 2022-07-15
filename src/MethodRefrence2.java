
interface Length{
	int length(String str);
}
public class MethodRefrence2 {
	
	static int meth(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		Length l=MethodRefrence2::meth;
		int n=l.length("ashvin");
		System.out.println(n);
	}
}
