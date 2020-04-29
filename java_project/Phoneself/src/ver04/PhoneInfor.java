package ver04;

public class PhoneInfor {

	String name;
	String phonenumber;
	String address;
	String email;
	
	PhoneInfor(String name, String phonenumber, String address, String email){
		this.name=name;
		this.phonenumber=phonenumber;
		this.address=address;
		this.email=email;
		
	}
	
	void showBasicInfo() { // 기본정보출력메소드
		System.out.println("이름은 : "+this.name);
		System.out.println("번호는 : "+this.phonenumber);
		System.out.println("주소는 : "+this.address);
		System.out.println("이메일은 : "+this.email);
		
	}
	
	
	void showAllInfo() { // 오버라이딩을통해 유니브 컴패니에서 따로 추가
		showBasicInfo();
	}
	
}
