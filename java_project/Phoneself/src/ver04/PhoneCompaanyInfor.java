package ver04;

public class PhoneCompaanyInfor extends PhoneInfor {

	String company;
	
	PhoneCompaanyInfor(String name, String phonenumber, String address, String email,String company) {
		super(name, phonenumber, address, email);
		// TODO Auto-generated constructor stub
		this.company=company;
	}

	@Override
	void showAllInfo() {
		// TODO Auto-generated method stub
		super.showAllInfo();
		System.out.println("회사는 : "+this.company);
	}
	
	

	
	
	
	
}
