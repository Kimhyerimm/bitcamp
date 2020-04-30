package ver5;

public class PhoneCompaanyInfor extends PhoneBasic{

	

	String name;
	String phoneNumber;
	String email;
	
	String company;
	
	PhoneCompaanyInfor(String name, String phoneNumber, String email, String company) {
		super(name, phoneNumber, email);
		this.company=company;
	}
	


	public void showAllinfo() {
		showBasicInfo();
		System.out.println("회사는 : "+this.company);
		
	}
		
	}
	

