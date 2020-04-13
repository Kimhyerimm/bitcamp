package ex;

public class FlowEx8 {

	public static void main(String[] args)
	{
	int score = 1; // int타입 변수 스코어에 1저장
	switch(score*100) { // 1*100함
	case 100 : // 결과값이 100이면 아래출력
	System.out.println("당신의 점수는 100");
	case 200 : // 결과 200이면 아래서부터
	System.out.println("당신의 점수는 200");
	case 300 : // 결과 300이면 아래서부터
	System.out.println("당신의 점수는 300");
	case 400 : //결과 400이면 아래서부터
	System.out.println("당신의 점수는 400");
	default : // 값없으면 아래서부터
	System.out.println("점수없음.");
	}
	}
	}
// 다출력되는 이유 브레이크가없어서 스코어값 100인 케이스100에들어가서
// 아래까지 쭈욱 출력댐
