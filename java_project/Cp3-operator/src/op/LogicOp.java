package op;

public class LogicOp {

	public static void main(String[] args) {
	
		// 정수형 데이터 두개를 받는다.
		int num1=10; // 사용자에게 받는 첫번째 숫자
		int num2=20; // 사용자에게 받는 두번째 숫자
		
		// num1이 num2보다 큰지 확인
		// 큰경우 -> true, 작은경우 ->false
		
		boolean check1 = num1>num2;
		boolean check2 = num1==num2;
		
		
		
		if(check1) {
			System.out.println("num1의 값이 num2의 값보다 큽니다");
		}
		else {
			System.out.println("num1값이 num2보다 작습니다");
		}
		
		System.out.println("----------------------");
		
		//성인 여성중 기혼자에게만 메시지를 출렵합니다.
		// 성인
		// 여성
		// 기혼자
		int age = 20;
		char gender = 'm';
		boolean mCheck = true;
		
		boolean result = age>19 && gender=='w';
		
		if(result) {
			
			System.out.println("메시지를 보냅니다");
		}
		
	}

}
