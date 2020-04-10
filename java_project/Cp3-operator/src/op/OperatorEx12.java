package op;

public class OperatorEx12 {

	public static void main(String[] args) {
		int a = 1000000 * 1000000 / 1000000; // int타입 변수 a에 1000000*1000000 하면
		// 이미 int 크기 넘었으니까 날려버리고 / 1000000
		int b = 1000000 / 1000000 * 1000000; // 1* 1000000
		
		System.out.println(a); // 날려버린값 / 1000000 값이나옴
		System.out.println(b); // 1000000 출력

	}

}
