package ex;

public class CastingEx2 {

	public static void main(String[] args) {
		byte b = 10; // byte타입 변수b에 10저장
		int i= (int)b; // int타입 변수i에 위에 byte타입b를 int타입으로 명시적변환값을 저장
		System.out.println("i="+i); // 문구 "i="와 i값이 합쳐졌으므로 문구로 i=10출력 
		System.out.println("b="+b); // 문구 "b="와 b값이 합쳐졌으므로 문구로 b=10출력
		
		int i2 = 300; // int 타입 변수 i2에 300 저장
		byte b2 = (byte)i2; // byte 타입 변수 b2에 byte타입으로 먼저 i2를 명시적변환후 값 저장
		System.out.println("i2="+i2); // 문구 i2시작이니까 i2 300이 뒤에 문구로 출력 i2=300
		System.out.println("b2="+b2); // 문구 b2시작이니까 정수 300이 byte값으로 바뀐 값이 출력 
	}

}
