package phonever3;

/*
Version 0.1 전화번호 관리 프로그램. 
PhoneInfor 라는 이름의 클래스를 정의해 보자. 
클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 
저장된 데이터의 적절한 출력이 가능하도록 메소드 정의

• 이름            name              String
• 전화번호       phoneNumber     String
• 생년월일       birthday            String 

단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
*/

public class PhoneInfor {

	
	String name;
	String phoneNumber;
	String birthday;
	
	
	PhoneInfor(String name, String phoneNumber, String birthday){ // 3개 받을 저장값 초기화
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
	}
	
	 PhoneInfor(String name, String phoneNumber) { // 생일정보 안받을때 초기화 -> 오버로딩
	this(name,phoneNumber,"생일 입력하지않음");
	}
	
	 
	 void showInfo() { // 출력메소드
		 
		 System.out.println("이름은 : "+this.name);
		 System.out.println("폰번호는 : "+this.phoneNumber);
		 System.out.println("생일은 : "+this.birthday);
	 }
	
	
	// 이름값을 문자열 비교하는 메소드
	 boolean checkName(String name) {
		 return this.name.equals(name); // equals = 앞에 문자열을 ( ) 문자열과 비교해서 똑같으면 true로 반환시킴
		 // equals 펑션을 쓸거면 메소드를 애초에 boolean으로 만들자!
	 }
	 
	
}
