package ex;

public class FlowEx6 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random() * 10) + 1;
		// 매스.랜덤 = 0~0.999999~ 난수출력 그런데 뒤에 *10하면 0~9.9999~ 인데 int로바꾸면 0~9까지
		// +1하니까 1~10까지 값이 스코어에저장됨
		switch(score*100) { // 1~100저장된 스코어값에 *100하고 아래로
		case 100://스코어가 100일때 아래출력
			System.out.println("당신의 점수는 100");
			break;
		case 200: // 스코어가 200일때
			System.out.println("당신의 점수는 200");
			break;
		case 300: // 300일때
			System.out.println("당신의 점수는 300");
			break;
		case 400: // 400일때
			System.out.println("당신의 점수는 400");
			break;
		
		default : // 아무것도 값이없을때 
		System.out.println("점수없음");
			
			
			
			
			
			
		}
		
		
		
	}
}


