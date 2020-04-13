package ex;

public class FlowEx5 {

	public static void main(String[] args) {


		int score = 82; // int타입 변수 스코어에 82저장
		String grade = ""; // 문자열 그레이드에 공백저장
		
		System.out.println("당신의 점수는"+ score + "입니다");
		
		if(score>=90) { // 만약 스코어가 90보다 크거나 같으면 아래
			grade = "A"; // 그레이드에 A가 저장됨
			if ( score>=98) { // 90보다크거나 같으면서도 스코어가 98이상이면 아래
		grade += "+"; // 기존 그레이드값 A에 +를 더함 -> A+
			}
			else if(score<94) { // 스코어가 90이상 조건안에서 94미만이면 아래
				grade += "-"; // 기존 그레이드 A에 -를더함 ->A-
				
			}
		}
		else if(score>=80) { // 스코어가 80이상이면 아래
			grade ="B"; // 그레이드에 B저장
			if(score >=88) { // 스코어가 80이상이면서 88이상이면
				grade += "+"; // B에 + 붙임
			}
			else if(score<84) { // 스코어가 84미만이면 아래
				grade +="-";
			}
		}
			
			
			System.out.println("당신의 학저은"+grade);
		

	}

}
