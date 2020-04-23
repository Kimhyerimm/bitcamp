package ex;

public class OverridngTest {

	public static void main(String[] args) {
		
		// 다형성 : 상위 클래스 타입의 참조변수에 하위클래스의 인스턴스를 참조
		
		Speaker bs= new BaseEnSpeaker();
		bs.setVolume(10);
		bs.abcd(); // bs.abc는 안됨
		bs.showCurrentState();
		
		System.out.println("-----------------------------");
		
		BaseEnSpeaker bSpeak = new BaseEnSpeaker();
		bSpeak.setVolume(50);
		bSpeak.setBaseRate(20);
		bSpeak.showCurrentState();
		bSpeak.abc();
		
		System.out.println(bSpeak); // toString()
	}

}
