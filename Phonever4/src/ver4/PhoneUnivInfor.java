package ver4;

public class PhoneUnivInfor extends PhoneBasic{

	
	String name;
	String phoneNumber;
	String email;
	
	String major;
	String year;

	PhoneUnivInfor(String name, String phoneNumber, String email, String major, String year) {
		super(name, phoneNumber, email);
		this.major=major;
		this.year=year;
		
	}

	@Override
	void showAllinfo() {
		super.showBasicInfo();
		System.out.println("학과는 :" + this.major);
		System.out.println("학년은 :" +this.year);
	}
	
	
	
	

	



}

 
