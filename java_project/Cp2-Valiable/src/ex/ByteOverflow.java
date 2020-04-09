package ex;

public class ByteOverflow {

	public static void main(String[] args) {

		byte b = 0; // byte타입 변수b에 0저장  -128~127
		int i = 0; // int타입 변수i에 0 저장

		for (int x = 0; x <= 270; x++) { // int타입 변수x 0부터 270와 같거나 270이 더 클때까지 x를 1씩 계속 더한다
			System.out.print(b++); // x 조건이 충족될때까지 byte 를 1씩 더해 출력함
			System.out.print('\t'); // 탭을 의미 -> 줄바꿈
			System.out.println(i++); // x조건이 충족될때까지 i값을 1씩 더해 출력함
			
		}

	}

}
