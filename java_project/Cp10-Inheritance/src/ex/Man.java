package ex;

public class Man {

	String name;
	int num;
	String phone;
//	Man(){
//		
//	}
	
	
	Man(String name, int num, String phone){
		this.name=name;
		this.num=num;
		this.phone=phone;
	}
	
	void tellyourname() {
		
		System.out.println("나의 이름은"+this.name+"숫자는 :"+this.num+"폰은 :"+this.phone);
	}
	
}
