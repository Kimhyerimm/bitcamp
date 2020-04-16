package ex;

public class Number {

		int num;
//		//생성자 
//		Number (){ // 생성자 이름은 클래스 이름으로
//			System.out.println("생성자 호출");
//			num = 1000;
//		}
	
	Number(int n){
		System.out.println("생성자 호출");
		num =n;
	}
		
		public static void main(String[] args) {
			
			Number n1 = new Number(100000);
			
			System.out.println(n1.num);
			
			
			
		}
		
}
		
		
		
		

