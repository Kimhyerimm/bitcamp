package op;

public class OperatorEx7 {

	public static void main(String[] args) {
		boolean power = false; // boolean 타입 변수 power에 false 저장
		System.out.println(power); // false 그대로 출력 
		
		power = !power; // power의 값을 바꿈 
		
		System.out.println(power); // 바꾼 true 출력
		power = !power; // 또다시 바꿈 
		
		System.out.println(power); // false 출력

	}

}
