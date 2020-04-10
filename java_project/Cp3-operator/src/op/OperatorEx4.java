package op;

public class OperatorEx4 {

	public static void main(String[] args) {
		int i = -10; // int타입 변수 i 에 -10 저장
		i = +i; // +i 는 암것도아님 처리안댐
		System.out.println(i); // 그대로 -10 출력
		i=-10; // i는 -10 저장
		i = -i; // i = -(-10) 이니까 i=10이됨
		System.out.println(i);

	}

}
