package ex;

public class MemberCall {

	// 인스턴스 변수
	int iv=10;
	
	// 클래스변수, 스태틱변수
	static int cv = 20;
	
	int iv2=cv;
	//static int cv2 = iv;
	
	static int cv2 = new MemberCall().iv; // 인스턴스 생성
	
	
	
	static void staticMethod() { // static쓰면 static 변수는 쓸수있음
		// 그 이외에는 인스턴스 해야함
		
		// 스테틱 멤버 출력
		
		System.out.println(cv);
		
		//인스턴스 멤버 출력
//		System.out.println(iv); // iv는 위쪽 지역멤버니까 못씀 인스턴스해야함
		
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	}
	
	void instanceMethod() {
		System.out.println(cv);
		
		System.out.println(iv);
	}
	
	
}
