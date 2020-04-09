package ex;

public class CastingOperation {

	public static void main(String[] args) {
		char ch1 = 'A'; // char 타입 변수ch1에 문자 A저장
		char ch2 = 'Z'; // char 타입 변수 ch2에 문자 Z 저장
		
		int num1=ch1; // int 타입 num1변수에 ch1[A]를 저장 char타입이 int로 바뀜
		int num2=(int)ch2; // int 타입 num2에 ch2[Z]를 명시적변환 후 저장 char타입이 int로 바뀐후 int로 들어감
		
		System.out.println("문자 A의 유니코드 값:" +num1); // A의 유니코드 int로 출력
		System.out.println("문자 Z의 유니코드 값:" +num2); // Z의 유니코드 int로 출력
		
	}

	
}
