package ver04;

public class PhoneCafeInfor extends PhoneInfor {

	String cafe;
	
	PhoneCafeInfor(String name, String phonenumber, String address, String email,String cafe) {
		super(name, phonenumber, address, email);
		// TODO Auto-generated constructor stub
		this.cafe=cafe;
		
	}

	@Override
	void showAllInfo() {
		// TODO Auto-generated method stub
		super.showAllInfo();
		System.out.println("동호회는 : "+this.cafe);
	}

	
	
	
}
