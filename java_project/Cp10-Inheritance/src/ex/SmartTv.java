package ex;

public class SmartTv extends Tv{
	
	String ch="YouTube";

	@Override
	void display() {
		super.display();
		System.out.println(ch+"방송을 시청합니다.");
	}
	

}
