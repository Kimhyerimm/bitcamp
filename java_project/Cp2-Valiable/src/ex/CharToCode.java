package ex;

public class CharToCode {

	public static void main(String[] args) {
	
			 char ch = 'A'; // char타입 ch변수에 A를 저장
			 int code = (int)ch; // int타입 code변수에 위 ch변수를 int로 명시적변환하여 저장
			
			 System.out.println(ch); // 그냥 ch인 A를 출력
			 System.out.println(code);  // 명시적으로바뀐 A의 유니코드 정수로 65출력

	}

}
