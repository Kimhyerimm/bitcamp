package op;

public class OperatorEx24 {

	public static void main(String[] args) {
		char x ='j'; // char타입 변수x에 j저장 
		
		if((x>='a' && x<='z') || (x>='A' &&  x<='Z')) { 
			// or 연산자니까 앞에만 계산함
			// j가 a보다 큼 and j보다 z가 더큼 -> 참
			// 뒤에껀 연산안해도댐 참이니까 바로아래로
			System.out.println("유효한 문자입니다.");
		} 
		else {
			System.out.println("유효하지 않은 문자입니다.");
		}

	}

}
