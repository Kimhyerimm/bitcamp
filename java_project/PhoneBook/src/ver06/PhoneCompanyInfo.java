package ver06;

public class PhoneCompanyInfo extends PhoneInfor{

	String company; // 회사이름 
	String dept; // 부서이름
	String job; // 직급
	
	
	PhoneCompanyInfo(String name, String phoneNumber, String addr, String email,String company, String dept, String job) {
		super(name, phoneNumber, addr, email);
		this.company=company;
		this.dept=dept;
		this.job=job;
		// TODO Auto-generated constructor stub
	}


	public void showAllInfo() {
		showBasicInfo();
		System.out.println("회사의 이름은 :"+this.company);
		System.out.println("회사의 부서는 :"+this.dept);
		System.out.println("회사의 직급은 :"+this.job);
	}

	
	
}
