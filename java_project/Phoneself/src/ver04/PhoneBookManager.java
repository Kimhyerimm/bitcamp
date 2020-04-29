package ver04;

import java.util.Scanner;

public class PhoneBookManager {

	PhoneInfor[] array;
	int num;
	Scanner kb;
	PhoneBookManager(int numarray) { // 초기화
		array = new PhoneInfor[numarray];
		num=0; // 배열개수 초기화

	}
	
	void arraysave(PhoneInfor value) { // 정보저장될곳
		array[num]=value;
		num++;
	}
	
	void addarray() {
		
		kb= new Scanner(System.in);
		PhoneInfor value = null; // value값을 초기화
		
		System.out.println(" "+Bunki.UNIV+". 대학 "+Bunki.COMPANY+". 회사 "+Bunki.CAFE+". 동호회");
		int friendchoice = kb.nextInt();
				
				
		System.out.println("이름을 입력하세요 : ");
		String name=kb.nextLine();
		System.out.println("번호를 입력하세요 : ");
		String phonenumber = kb.nextLine();
		System.out.println("주소를 입력하세요 : ");
		String address = kb.nextLine();
		System.out.println("이메일을 입력하세요 :");
		String email = kb.nextLine();
		
		
		switch(friendchoice) { // 분기시작
		
		case Bunki.UNIV :
			System.out.println("전공을 입력하세요 : ");
			String major = kb.nextLine();
			System.out.println("학년을 입력하세요 : ");
			String year = kb.nextLine();
			
			//인스턴스화해서 저장시키자
			value = new PhoneUnivInfo(name, phonenumber, address, email, major, year);
			break;
			
		case Bunki.COMPANY :
			System.out.println("회사를 입력하세요 : ");
			String company = kb.nextLine();
			
			value = new PhoneCompaanyInfor(name, phonenumber, address, email, company);
			break;
		case Bunki.CAFE :
			System.out.println("동호회를 입력하세요 : ");
			String cafe = kb.nextLine();
			
			value = new PhoneCafeInfor(name, phonenumber, address, email, cafe);
			break;
		} // switch 분기 끝
		
		arraysave(value);
	} // addarray 끝
	
	
	// 삭제, 검색 , 수정 을 위해서 인덱스값을 먼저 찾자
	// 삭제 검색 수정 기준은 이름으로 하자. 
	int searchIndex(String name) { // 매게변수에 기준값 이름 을 넣자
		
		int index = -1; // 0번지부터시작인데 그 이하면 값이없는걸 알려줘야하니까

			for(int i=0; i<num; i++) {
				if(array[i].equals(name)) {
					index=i;
					break;
				} // 하위 if 끝 
			} // for 끝
			
		return index;
	} // searchIndex 끝 
	
	
	void showInfo() {
		
		for(int i=0; i<num; i++) {
			array[i].showAllInfo();
		}	
	} // showInfo 끝
	
	void searchInfo() {
		//먼저 키값받아오자
		System.out.println("검색할 이름을 입력하세요 : ");
		String name = kb.nextLine();
		int index=searchIndex(name);
		
		if(index<0) {
			System.out.println("검색한 데이터가 없습니다");
			return;
		}
		else if(index >0){
		System.out.println("검색한 데이터의 정보를 출력합니다");
		array[index].showAllInfo();
	} //else if 끝
	}// serachInfo 끝
	
	void deleteInfo() {
		System.out.println("삭제할 이름을 입력하세요 : ");
		String name = kb.nextLine();
		int index=searchIndex(name);
		
		
		
		if (index<0) {
			System.out.println("검색한 데이터가 없습니다");
		}
		else if( index>0 ) {
			
			for(int i=index; i<num-1; i++) {
				array[i]= array[i+1]; // 뒤에값이 i로 저장됨
				
			}// for 끝
			num --;
		}// else if 끝
		
		
	}
	
	
	
	
	
	
	
	
	
} // 클래스 끝 
