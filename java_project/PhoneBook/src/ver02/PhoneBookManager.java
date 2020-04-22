package ver02;

import java.util.Scanner;

/*
	전화번호 정보를 저장하는 기능만을 포함하는 클래스

	1. 사용자로 부터 데이터를 받아서 인스턴스를 생성하고 반환 기능

*/

public class PhoneBookManager {

	
	
	 PhoneInfor createInstace() { // 메소드임
	
		PhoneInfor info = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구의 정보를 저장하기 위한 데이터를 입력합니다.");
		System.out.println("이름을 입력하세요. >>");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력하세요. >>");
		String phoneNumber = sc.nextLine();
		
		System.out.println("생일을 입력하세요. >>");
		String birthday = sc.nextLine();
		
		//사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분
		if(birthday == null || birthday.trim().isEmpty()) { // trim = 양쪽의 공백을 빼줌
			// isEmpty = birthday의 length가 0이면 true로 반환시켜줌 공백도 문자열이니 위에 trim사용
			info = new PhoneInfor(name, phoneNumber);
		} else {
			info = new PhoneInfor(name, phoneNumber, birthday);
		}
			
		
		return info;
		
		
		
	}
	
}
