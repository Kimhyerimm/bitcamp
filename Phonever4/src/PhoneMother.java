
public class PhoneMother {

	
	String name;
	String phoneNumber;
	String address;
	String email;
	
	
	PhoneMother(String name, String phoneNumber, String address, String email){ // 폰마더 변수들 초기화
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.email=email;		
	}
	
	
	void mother() { // 하위클래스에서도 계속 쓸 부모클래스
		System.out.println("이름은 : "+this.name);
		System.out.println("번호는 : "+this.phoneNumber);
		System.out.println("주소는 : "+this.address);
		System.out.println("이메일은 : "+this.email);
	}
	
	void overriding() { // 하위클래스에 추가할것들 오버라이딩 메소드
		
	}
	
	
	
	// 이름값을 문자열 비교하는 메소드
		 boolean checkName(String name) {
			 return this.name.equals(name); // equals = 앞에 문자열을 ( ) 문자열과 비교해서 똑같으면 true로 반환시킴
			 // equals 펑션을 쓸거면 메소드를 애초에 boolean으로 만들자!
		 }
	
	
	
	
}
