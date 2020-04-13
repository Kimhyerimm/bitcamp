package ex;

public class FlowEx7 {

	public static void main(String[] args) {
		char ch = (char)(Math.random() * 4 + 'A');
		//매스.랜덤 = 0~0.999999~ 난수출력 
		// * 4 하면 0~3.99999 인데 char형으로 변환후 나온값을 'A'값더함
		System.out.println(ch); // 먼저 계산해보니 C나옴  
		
		int score = 0; // int타입 변수 스코어에 0저장
		switch (ch) //ch 계산된값에따라 아래 처리
		{
		case 'A': // ch가 A라면 
		score = 90; // 스코어는 90
		break;
		case 'B': // ch가 B라면
		score = 80; // 스코어는 80
		break;
		case 'C': // ch가 C라면
		score = 70; // 스코어는 70
		break;
		
		case 'D': // ch가 D라면
			score = 60; // 스코어는 60
			break;
			}
			System.out.println("당신의 점수는 "+ score +"점 이상 입니다.");

	}

}
