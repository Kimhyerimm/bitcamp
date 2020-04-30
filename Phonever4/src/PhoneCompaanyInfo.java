
public class PhoneCompaanyInfo extends PhoneMother{

	String company; // 컴패니에 새로추가될 변수
	// 아래 초기화에 컴패니꺼 추가해주기 
	PhoneCompaanyInfo(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company=company; // 컴패니에있는거 따로 초기화
	}
	
	
	void overriding() { // 컴패니 오버라이딩해주자
		mother(); 
		System.out.println("회사는 : "+this.company);
	}
	

	
	
}
