package ex;

public class BusinessMan extends Man {

	String company;
	String position;
	
	// 조상클래스의 생성자가 있다면 자손클래스의 생성자에서 
	// 값을 받아 조상 클래스의 생성자를 호출해서 초기화 해준다.
	BusinessMan(String company, String position) { // String name 을 빼고 아래 name에 "name"으로 초기화도가능
		super("김보겸", 20, "갤8");
		this.company=company;
		this.position=position;
		
	}

		void tellYourInfo() {
			//super.tellyourName();
			tellyourname();
			System.out.println("나의 직장"+company+"입니다");
			System.out.println("나의 직급"+position+"입니다");
		}
		
		
	
}
