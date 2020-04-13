package ex;

public class FlowEx3 {

	public static void main(String[] args) {
		int score =45; // int타입 변수 스코어에 45저장 
		char grade =' '; // char타입 변수 그레이드에 공백 저장
		
		if (score>=90) { // 만약 스코어에 저장된값이 90과 같거나 크면 아래출력
			grade = 'A'; // 그레이드에 A저장
		}
		else if(score>=80) { // 스코어에 저장된값이 90보다 작고 80보다 크거나같을때 아래출력
			grade = 'B';
		}
		else { // 이도저도 다아니면 아래출력
			grade = 'C';
		}

		
		System.out.println("당신의 학점은"+grade+"입니다");
	}

}
