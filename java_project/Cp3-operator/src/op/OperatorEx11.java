package op;

public class OperatorEx11 {

	public static void main(String[] args) {
		long a  = 1000000 * 1000000; // long타입 a에 int 1 000000 000000 저장됨
		long b = 1000000 * 1000000L; // long타입 b에 long 1 000000 000000 저장됨
		System.out.println(a); // 1 00000 000000이 long으로 바뀐값 출력
		System.out.println(b); // 그대로 1 000000 000000 출력 

	}

}
