package ver4;

public class PhoneCompaanyInfor extends PhoneBasic{

	

	String name;
	String phoneNumber;
	String email;
	
	String company;
	
	PhoneCompaanyInfor(String name, String phoneNumber, String email, String company) {
		super(name, phoneNumber, email);
		this.company=company;
	}
	



	void showAllinfo() {
		// TODO Auto-generated method stub
		super.showBasicInfo();
		System.out.println("회사는 : "+this.company);
		
	}
		
	}
	

