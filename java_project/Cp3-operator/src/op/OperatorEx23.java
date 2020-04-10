package op;

public class OperatorEx23 {

	public static void main(String[] args) {
		float f = 0.1f; // float타입 변수 f에 0.1f 저장
		double d = 0.1; // 더블타임 변수 d에 0.1 저장
		double d2 = (double)f; // 더블타입 변수 d2에 0.1f를 더블로바꾼값 저장
		
		System.out.println("10.0==10.0f ? "  + (10.0==10.0f));
		// 10.0 == 10.0f 맞으니까 트루
		System.out.println("0.1==0.1f ?" + (0.1 ==0.1f));
		// 다를듯? -> 다른거 펄스 맞음 
		System.out.println("f=" +f);
		// 0.1 출력
		System.out.println("d=" + d);
		// 걍 0.1출력 
		System.out.println("d2=" +d2);
		// 0.1f가 더블타입으로 바뀐값 출력 
		System.out.println("d==f ?" + (d==f));
		// 트루나올듯? -> 펄스임 , 플롯 0.1f랑 더블 0.1은 다름
		System.out.println("d==d2 ?" + (d==d2));
		// d는 그냥 0.1이고 d2는 0.1f를 더블로바꾼거니까 다름
		System.out.println("d2==f ?" + (d2==f));
		// d2를 이미 더블로바꾸는순간 f랑 다를듯 펄스 가아니라 트루네 
		
		
		

	}

}
