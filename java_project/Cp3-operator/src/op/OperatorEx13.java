package op;

public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a'; // a 유니코드값이 숫자로 c1에드감 97
		char c2= c1; // c2=a유니코드값 저장 97
		char c3= ' '; // c3은 걍 공백저장
		int i = c1 + 1; // c1 유니코드값 +1이 i에저장 98
		c3 = (char)(c1+1); // 98이 char로 명시적변환후 c3에 저장됨 98은char로 b
		c2++; // c2는 97 아직더하기안함
		c2++; // 여기서 c2는 98로 한번더해지고 한번더 아래에서 더함
		System.out.println("i=" + i); // i값 98 
		System.out.println("c2=" +c2); // 여기서 한번더 더해지니까 99니까 c
		
	System.out.println("c3="+c3); // c3은 98이니까 b

	}

}
