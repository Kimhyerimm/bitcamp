package scm;

public class Tv extends Product{

	Tv(int price) { // 상위클래스의 생성자도 초기화 해줘야함
		super(price);
	}
	

	
	
	public String toString() {
		return "Tv";
	}
	
	void display() {
		System.out.println("Tv를 시청합니다");
	}
	

	
	
	
}
