package op;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte b = 10; // byte타입 변수b에 10 저장
		//byte result = ~b; // byte타입 변수 result 에 ~b값 [-11] 저장
		byte result = (byte)~b; // ~b는 이미 byte타입이니까 그대로
		
		System.out.println("b="+b); // b 그대로 10
		System.out.println("~b="+ result); //  ~b인 -11

	}

}
