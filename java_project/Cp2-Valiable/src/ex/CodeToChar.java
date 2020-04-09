package ex;

public class CodeToChar {

	public static void main(String[] args) {
		int code = 65; // int타입  변수code에 65 저장
		 char ch = (char)code; // char타입 변수ch에 code를 char타입으로 명시적 우선 변환후 저장 
		 // 그냥 code하면 안되는 이유가 int code를 char ch 에 대입하면 int 형식크기가 더 커서 오류뜸.
		 // 고로 명시적변환을 미리해준후에 대입해야함 
		 System.out.println(code); // 그냥 code 65 출력 
		 System.out.println(ch);  // 65를 char로 바꾼 A 출력

	}

}
