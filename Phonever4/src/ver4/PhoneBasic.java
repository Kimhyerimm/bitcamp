package ver4;

public class PhoneBasic {

	String name;
	String phoneNumber;
	String email;
	
	PhoneBasic(String name, String phoneNumber,String email) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
		
	}
	
	
	void showBasicInfo() {
		System.out.println("이름은 : "+this.name);
		System.out.println("번호는 : "+this.phoneNumber);
		System.out.println("메일은 : "+this.email);
	}
	
	
	void showAllinfo() {
		showBasicInfo();
	}
	
	
	
	
}
