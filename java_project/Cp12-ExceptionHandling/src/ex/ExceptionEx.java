package ex;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
	
		
		
		
		
		try {
			int age = readAge();
		
			
			System.out.println("나이는 "+age+"세 입니다.");
			
			
		} 
		
		catch(AgeInputException e) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
		}
		
	
		System.out.println("프로그램 정상종료");
		

	} // main 끝
	
	
	
	static int readAge() throws AgeInputException {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = kb.nextInt();
		

		if(age<0) {
			
			
//			Exception e = new Exception("고의로 발생시킴 ");
			AgeInputException e = new AgeInputException();
			throw e; // 강제적으로 예외 발생 지점
		}
		return age;
	
	} 
	

}
