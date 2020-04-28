package friend;

public class HeighFriend extends Friend {

	String work; // 고딩친구의 직업
	
	
	public HeighFriend(String name, String phoneNumber, String address,String work) { // 위에 work가 새로생겼으니 매개변수도 하나 더 초기화해줘야함 
		super(name, phoneNumber, address);
		this.work=work;
	}

	// 하위클래스[고딩친구] 직업 추가부분
	public void showData() {
		showBasicInfo();
		System.out.println("직업 : "+this.work);
	}
	
}
