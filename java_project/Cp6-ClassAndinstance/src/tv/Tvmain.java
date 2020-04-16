package tv;

public class Tvmain {

	public static void main(String[] args) {
		
		// Tv 인스턴스 생성
		
		Tv t = new Tv();
		
		
		
		System.out.println("--------------");
		System.out.println("tv의 속성값");
		System.out.println("tv의 color :"+t.color);
		System.out.println("tv의 전원 :"+t.power);
		System.out.println("tv의 현재 채널 :"+t.channel);
		
		t.channel = 7;
		System.out.println("tv의 현재 채널 :"+t.channel);
		t.channelUp();
		System.out.println("tv의 현재 채널 :"+t.channel);
		t.channelChange(100);
		System.out.println("tv의 현재 채널 :"+t.channel);
		
		t.channelDown();
		System.out.println("tv의 현재 채널 :"+t.channel);

	}

}
