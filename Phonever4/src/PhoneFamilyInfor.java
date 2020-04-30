

public class PhoneFamilyInfor extends PhoneMother{
	String relationship;
	
	
	PhoneFamilyInfor(String name, String phoneNumber, String address, String email, String relationship) {
		super(name, phoneNumber, address, email);
		this.relationship=relationship;
	}

	
	void overriding() { // 컴패니 오버라이딩해주자
		mother(); 
		System.out.println("관계는 : "+this.relationship);
	}
	
	
	
}
