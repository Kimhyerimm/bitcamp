package op;

public class abc {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result; 
		result = (num1+=10)<0 && (num2+=10)>0; 
		System.out.println("result="+result); 
		System.out.println("num1="+num1+", num2="+num2); 
		 
		
		
		result = (num1+=10)<0 || (num2+=10)<0; // or연산자에서 앞에가 참이면 뒤에 따로 연산안함 ,거짓이면 뒤에까지 연산후에 참거짓 출력 
		System.out.println("result="+result); 
		System.out.println("num1="+num1+", num2="+num2);

	}

}

