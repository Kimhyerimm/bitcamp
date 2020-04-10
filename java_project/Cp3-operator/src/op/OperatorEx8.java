package op;

public class OperatorEx8 {

	public static void main(String[] args) {
	
		byte a = 10; // byte타입 변수a에 10저장
		byte b = 20; // byte타입 변수b에 20저장
		byte c = (byte)(a+b); // byte타입 c에 (a+b)=30 int로된값을 byte로 명시적변환후 저장
		System.out.println(c); // c인 30출력

	}

}
