package ex;

public class FlowEx4 {
	
	public static void main(String[] args) {
		
		
		int score = 45; // int타입 변수 스코어에 45저장
		char grade=' '; // char타입 변수 그레이드에 공백저장
		grade = (score>=90) ? 'A': ((score>=80) ? 'B':'C');
		// 스코어점수가 90보다 크거나 같으면 A출력 작으면 뒤에 출력
		// 뒤에서는 스코어가 80보다 크거나 같으면 B출력 작으면 C출력
		System.out.println("당신의 학점은"+grade+"입니다");
		
		
	}

}
