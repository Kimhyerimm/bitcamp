package op;

public class OperatorEx22 {

	public static void main(String[] args) {
		
		if(10==10.0f) {  // 10은 10.0f니까 아래출력 
			System.out.println("10과 10.0f는 같다.");
		}
		
		if('0' !=0) {  // 0은 0이 아니다
			System.out.println("'0'과 0은 같지않다.");
			
		}
		if('A'==65) { // A는 65맞으니까 아래출력
			System.out.println(" \"A\"는 65와 같다. ");
		}
		int num=5; // int타입 변수 num에 5저장 
		if(num>0 && num <9) { // 5>0 and 5<9 참이니까 아래 출력
			System.out.println("5는 0보다 크고, 9보다 작다.");
		}

	}

}
