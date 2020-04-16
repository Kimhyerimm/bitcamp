package tv;

public class Tv {

	
	// tv의 속성(변수) = 멤버변수, 인스턴스 변수
	String color; // tv 색상 값
	boolean power; // tv 전원 상태
	int channel; // tv 현재 채널 값
	
	// tv의 기능(메서드) = 클래스의 멤버
	
	// tv의 전원 on/off 기능 
	void power() {
//		if(power) { // 원래 power==true 지만 if문에서는 바로 트루이니까
//			power = false; // 켜있는상태로 파워누르면 오프
//		} else {
//			power = true; // 꺼잇는상태로 파워누르면 온
//		}
//		
		power =!power; // power[false]일때 true라면 on , true일때 false라면off
	
	}
	
	// 채널을 올리는
	void channelUp() { 
//		channel = channel +1;
		channel++;
	}
	
	// 채널을 내리는
	void channelDown() {
//		channel = channel -1;
		channel--;
	}
	
	// 채널값을 변경하는 : 채널값[데이터]을 받아서 변경
	void channelChange(int ch) {
		channel = ch;
		
	}
	
	
	


}
