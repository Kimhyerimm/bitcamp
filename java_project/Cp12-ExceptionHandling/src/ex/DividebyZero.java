package ex;

public class DividebyZero {
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		
		
		
		
		try {
		int divide = num1/num2;
		System.out.println("연산의 결과는 : "+divide); 
		
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return ;
		}
		finally {
			System.out.println("무적권 실행함");
		}
		
		
		
		
		
		System.out.println("종료");
		
		
	}
}
