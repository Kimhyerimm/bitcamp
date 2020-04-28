package friend;

public class UnivFriend extends Friend{

	String major; // 대딩친구의 전공
	int grade; // 대딩친구의 학년
	
	
	UnivFriend(String name, String phoneNumber, String address,String major,int grade) { // 똑같이 위에 메이저 그레이드 초기화 매개변수 추가 
		super(name, phoneNumber, address);
		this.major=major;
		this.grade=grade;
	}
	
	public void showData() {
		showBasicInfo();
	System.out.println("전공 :" +this.major);
	System.out.println("학년 :"+this.grade);
	}

}
