package op;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5; // int타입 변수 i에 5 저장
		int j= 0; // int타입 변수 j에 0 저장
		j = i++; // j는 i 후위형증가 j는 아직 5
		
		System.out.println("j=i++; 실행 후, i=" +i  +",j="  +j); // i는 6, j는 5출력

	}

}
