package ex;

public class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
		
	}
	
	void channelup() {
		channel++;
	}
	
	void channeldown() {
		channel--;
	}
	
	
	void display() {
		System.out.println("tv재생");
		
	}
	
	
}
