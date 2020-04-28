package friend;

/*
 친구의 정보를 저장하기 위한 클래스
 상속을 목적으로 기본클래스 정의
 기본 속성과 기능을 구성 
 */




//public abstract class Friend {
public abstract class Friend implements Info{

	String name; // 친구의 이름
	String phoneNumber; // 친구의 번호 
	String address; // 친구의 주소
	
	
	//생성자
	Friend(String name,String phoneNumber,String address){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		
	}
	
	// 하위클래스에 중복으로 들어갈 값들 오버라이딩 메소드
	void showBasicInfo() {
		System.out.println("이름 :"+this.name);
		System.out.println("전화번호 :"+this.phoneNumber);
		System.out.println("주소 :"+this.address);
	}
	
	// 하위클래스 값을 추가하기위한 오버라이딩 메소드
//	void showData() {
//		
//	}

	// 추상 메서드 생성 
//	abstract void showData();

	
	
	
}
