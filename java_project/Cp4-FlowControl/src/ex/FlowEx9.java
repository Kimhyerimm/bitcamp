package ex;

public class FlowEx9 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 10) + 1;
		// 계산된값 1~9값 int타입 변수 스코어에 저장
		System.out.println(score); // 계산값은 3
		String msg =""; // 문구타입 변수 msg에 공백저장
		score *= 100; // 스코어=스코어*100 -> 300
		msg = "당신의 점수는 " + score + "이고, 상품은 ";
		// msg 문구니까 위에저장
		switch(score) { 
		case 1000 : // 스코어가 1000이면 아래
		msg += "자전거, "; // msg = msg + "자전거, ";
		case 900 : // 스코어 900 이면 아래
		msg += "TV, ";
		case 800 : // 스코어 800이면 아래
		msg += "노트북, ";
		case 700 : // 스코어 700이면 아래
		msg += "자전거, ";
		default : // 값 없으면 아래
		msg += "볼펜";
		}
		System.out.println( msg + "입니다.");
		} }
	
	
	


