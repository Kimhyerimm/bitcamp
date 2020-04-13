package ex;

public class FlowEx10 {

	public static void main(String[] args) {
		int score = 88; // 스코어에 88저장
		char grade =' '; // 그레이드에 공백저장
		switch(score) { // 스위치시작
		case 100: case 99: case 98: case 97: case 96:
		case 95: case 94: case 93: case 92: case 91:
		case 90 : // 스코어점수가 위에 써있는값들이면 아래로
		grade = 'A'; // 그레이드에 A저장댐
		break;
		case 89: case 88: case 87: case 86:
		case 85: case 84: case 83: case 82: case 81:
		case 80 : // 스코어점수가 위에 써있는값들이면 아래로
		grade = 'B'; // 그레이드 B저장
		break;
		case 79: case 78: case 77: case 76:
		case 75: case 74: case 73: case 72: case 71:
		case 70 : // 스코어점수 얘네면

		grade = 'C'; // C저장
		break;
		case 69: case 68: case 67: case 66:
		case 65: case 64: case 63: case 62: case 61:
		case 60 :	//스코어가 얘네면
		grade = 'D'; // D저장
		break;
		default : // 위에 케이스에 하나도안걸리면 아래
		grade = 'F';		//F저장
		} 
		System.out.println("당신의 학점은 " + grade + "입니다.");
		//88이니까 B에걸침
			
			
	}

}
