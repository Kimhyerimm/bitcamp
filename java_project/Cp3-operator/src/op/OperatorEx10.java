package op;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000; // int타입 a에 백만 저장
				int b = 2000000; // int타입 b에 2백만 저장
				long c = (long)(a*b); // long타입 변수 c에 a*b 저장 int 2000000000000
				System.out.println(c); // int 2000000000000 가 long 으로 바뀐값으로 들어감
	}

}
