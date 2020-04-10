package op;

public class OperatorEx5 {

	public static void main(String[] args) {
		byte b = 10; // byte타입 변수 b에 10 저장
		System.out.println("b="   +b); // 그냥 b값 10 출력
		System.out.println("~b="  + ~b); // 100뭐시기를 치환함 011~~ 
		System.out.println("~b+1="  + (~b+1)); // ~b가 -11이니까 +1 하면 10
	}

}
