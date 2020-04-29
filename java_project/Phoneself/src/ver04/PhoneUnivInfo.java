package ver04;

public class PhoneUnivInfo extends PhoneInfor{

	String major;
	String year;
	
	
	PhoneUnivInfo(String name, String phonenumber, String address, String email,String major, String year)
	{
		super(name, phonenumber, address, email);
		// TODO Auto-generated constructor stub
		this.major=major;
		this.year=year;
	}




	@Override
	void showAllInfo() {
		// TODO Auto-generated method stub
		super.showAllInfo(); // showBasicInfo 가 들어있음
		System.out.println("전공은 : "+this.major);
		System.out.println("학년은 : "+this.year);
	}
	
	
	
	

}
