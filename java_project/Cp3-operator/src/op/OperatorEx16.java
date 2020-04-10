package op;

public class OperatorEx16 {

	public static void main(String[] args) {
		
		char lowerCase = 'a'; // a유니코드 97이 저장댐
		char upperCase = (char)(lowerCase-32); // 97-32 = 65를 char로 변환하고 대입
		char c=(char)65; // 65가 char타입으로바낌
		System.out.println(c); // 65는 대문자 A임
		System.out.println(upperCase); // 똑같음 
		

	}

}
