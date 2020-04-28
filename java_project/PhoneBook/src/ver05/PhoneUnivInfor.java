package ver05;

// PhoneInfo 클래스를 상속해서 새로운 클래스를 정의
public class PhoneUnivInfor extends PhoneInfor{

	
	String major; // 친구의 전공
	String grade; // 친구의 학년
	
	
	//상속받은 생성자 초기화
	PhoneUnivInfor(String name, String phoneNumber, String addr, String email,String major, String grade) {
		super(name, phoneNumber, addr, email);
		 this.major=major;
		 this.grade=grade;
	}
	
// 오버라이딩을 통해 새로생긴 메이저, 그레이드 출력추가
public void showAllInfo() { 
		super.showBasicInfo();
		System.out.println("친구의 전공은 : "+this.major);
		System.out.println("친구의 학년은 : "+this.grade);
	}

	
	
}
