package ver06;

public class PhoneCafeInfo extends PhoneInfor {

	String cafeName; // 동호회 이름
	String nickName; // 동호회 닉네임 
	
	PhoneCafeInfo(String name, String phoneNumber, String addr, String email,String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName=cafeName;
		this.nickName=nickName;
		// TODO Auto-generated constructor stub
	}

	
	 public void showAllInfo() {
		showBasicInfo();
		System.out.println("동호회 이름은 :"+this.cafeName);
		System.out.println("동호회 닉네임은 :"+this.nickName);
	}

	
	
}
