package ex;

public class WhileContinue {

	public static void main(String[] args) {
	// 1~10까지의 숫자중 3의 배수를 제외하고 출력
	// 1~10 까지의 숫자중 3의 배수만 출력하자
		
		for (int i=1; i<11; i++) {
//			if(i%3 !=0)
//				System.out.println(i);
//			
		 if(i%3 ==0)
				continue; // 3의배수출력안함
			System.out.println(i);
		}
		
	}

}
