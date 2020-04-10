package op;

public class OperatorEx9 {

	public static void main(String[] args) {
		
		byte a = 10; // byte타입 변수 a에 10저장
		byte b = 30; // byte타입 변수 b에 30저장
		byte c = (byte)(a*b); // byte타입 변수 c에 a*b인 300 int값을 byte로 명시적변환
		System.out.println(c); // 300 인줄알았는데 byte는 128까지니까 300-128=172 
		//다시 128넘으니까 172 - 128 = 44

	}

}
