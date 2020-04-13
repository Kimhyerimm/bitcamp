package ex;

public class Ex1 {

	public static void main(String[] args) {
		
		//1~10까지의 합
		// 반복 +1씩
		
		int sum=0;
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			sum+=i;
		}

		
		System.out.println("1~10까지합은"+sum);
		System.out.println("-----------");

			int i=1;
			sum =0;
			while(i<=10) {
				sum +=i;
				i++;
			}
		
			System.out.println("1~10까지합은"+sum);
			
			
			
	}

}
