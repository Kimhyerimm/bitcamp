package ver05;


//상속을 위한 기본 클래스 구성 [ 상위클래스 ]
// 인스턴스 생성의 목적이 없다★★★★

//public class PhoneInfor { // 아래 변수 프라이빗으로 바꿔주자 바꾸면 매니저에서 서치인덱스도 books[i]를
	// 못쓰니까 폰인포에 체크네임 메소드 추가해서 써야함
public  class PhoneInfor {
	String name; // 친구의 이름
	String phoneNumber; // 친구의 번호
	String addr; // 친구의 주소
	String email; // 친구의 이메일 
	
	PhoneInfor(String name,String phoneNumber,String addr,String email){ // 초기화
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.addr=addr;
		this.email=email;
		
	}
	
	// 기본 정보 출력 메서드
	void showBasicInfo() {
		System.out.println("친구의 이름은 : "+ this.name);
		System.out.println("친구의 번호는 : "+ this.phoneNumber);
		System.out.println("친구의 주소는 : "+ this.addr);
		System.out.println("친구의 이메일은 : "+ this.email);
	}
	
	
	// 전체 정보 출력 메서드 
	// 상속 후 오버라이딩을 통해 재 구성
	void showAllInfo() { 
		showBasicInfo();
//		
	}
	

	
}
