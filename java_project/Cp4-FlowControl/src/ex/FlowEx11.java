package ex;

public class FlowEx11 {

	public static void main(String[] args) {
		int score = 88; // 스코어 88저장
		char grade =' '; // 그레이드 공백저장 
		switch(score/10) { // 88/10한값이니까 8
		case 10:
		case 9 : // 스코어가 10이나 9면 아래 그레이드에 A저장
		grade = 'A'; 
		break;
		case 8 : // 스코어 8이면 아래
		grade = 'B'; // 그레이드 B저장
		break;
		case 7 : // 스코어 7이면 아래
		grade = 'C';  // 그레이드 C저장
		break;
		case 6 : // 6이면
		grade = 'D';  //D저장
		break;
		default : // 위에안걸리면 아래
		grade = 'F'; // F저장
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		// 88/10하면 8이니까 B나올거임

	}

}
