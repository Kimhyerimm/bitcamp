
public class PhoneUnivInfo extends PhoneMother{

	
	String major; // 유니버클래스에 새로들어갈 메이저
	String year; // 위와동일 
	
	// 마더상속받았으니 초기화 해야하는데 위에 폰유니버 2개 추가 
	PhoneUnivInfo(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major=major; // 유니버에있는애들 따로초기화
		this.year=year;
	}
	
	
	void overriding() { // 유니버에 메이저 , 이얼 오버라이딩해주기
		mother(); // 상위클래스 불러오기
		System.out.println("전공은 : " + this.major);
		System.out.println("학년은 : " + this.year);
		
	}

	
	
	

}
