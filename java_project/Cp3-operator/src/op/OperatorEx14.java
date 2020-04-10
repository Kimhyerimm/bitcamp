package op;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c1= 'a'; // char타입 c1에 a저장 
		char c2= (char)(c1+1); // char타입 c2에 c1 +1인데 에러뜸 c1+1은 묶어서 char로 변환해서 쓰던가해야함  
			//char c2= 'a'+1; // 아님 c1이아닌 데이터값을 가져와서 'a'=97 +1 인 98이 char로들어가 b출력 
System.out.println(c2); // b출력 
	}

}
