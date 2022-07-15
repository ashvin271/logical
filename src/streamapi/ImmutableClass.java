package streamapi;

public final class ImmutableClass {

	final String  aadharCardNo;

	public ImmutableClass(String aadharCardNo) {
		super();
		this.aadharCardNo = aadharCardNo;
	}

	public String getAadharCardNo() {
		return aadharCardNo;
	}
	
	public static void main(String[] args) {
		
		ImmutableClass i=new ImmutableClass("10101");
		ImmutableClass i2=new ImmutableClass("1021515");
		System.out.println(i.getAadharCardNo());
		System.out.println(i2.getAadharCardNo());
	}
	
}
