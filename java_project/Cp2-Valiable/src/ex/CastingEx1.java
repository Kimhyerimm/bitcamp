package ex;

public class CastingEx1 {

	public static void main(String[] args) {
		double d = 100.0; // double타입 변수d에 100.0 저장
		int i = 100; // int타입 변수i에 100저장
		int result = i +(int)d; // int타입 변수result 에 i와 d를 명시적변환시킨값을 더하여 저장
		
		System.out.println("d="+d); // 문구"d="와 d인 100.0 문구로 합쳐져출력
		System.out.println("i="+i); // 문구"i="와 i인 100 문구로 합쳐져출력
		System.out.println("result="+result); // 문구 "result="와 result값인  100+100 200이 문구로 합쳐져출력

	}

}
