package exstudy;

public class PersonalNumInfo {

	String name; // 저장할 이름 
	String number; // 저장할 숫자 
	
	PersonalNumInfo(String name, String number) { // 초기화시킴
		this.name=name;
		this.number=number;
		
	}
	
	
	
	String getName() { // 위에 초기화시킨걸 게터 메서드로 호출 
		return name;
	}
	
	
	String getNumber() { // 위에 초기화시킨걸 게터 메서드로 호출
		return number;
	}
	
}
