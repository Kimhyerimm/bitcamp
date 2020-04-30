 package ver5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInfo {

	
	ErrorEmptyException e = new ErrorEmptyException("에러입니다");

	PhoneBasic[] info;
	int arraynum;
	Scanner kb;
	
	
	private static ArrayInfo single = new ArrayInfo(100);
	

	public static ArrayInfo getSingle() {
		return single;
	}


	private ArrayInfo(int num) {
	
		info = new PhoneBasic[num];
		arraynum = 0;
		kb= new Scanner(System.in);
		
	}
	
	void arrayadd (PhoneBasic value) {
		
		info[arraynum]= value;
		arraynum++;
		
	}
	
	
	void addmethod() {
	
		PhoneBasic value = null;

		int bunkivalue=0;
//		kb.nextLine();
		
		while(true) {
//			System.out.println(" "+choice.BASIC+". 일반친구");
			System.out.println(" "+choice.UNIVER+". 대학친구");
			System.out.println(" "+choice.COMPANY+". 회사친구");
			
			try {
				
			
			bunkivalue=kb.nextInt();
			
			if( ! (bunkivalue >= choice.UNIVER  && bunkivalue <=choice.COMPANY)) {
			
//				ErrorEmptyException e = new ErrorEmptyException(" 2 or 3 만 입력하세요");
				throw e;
			}
			
			} // try 끝
			
			catch(InputMismatchException e){
				System.out.println("문자가 아닌 숫자를 입력하세요.");
				continue;
			}
			catch (ErrorEmptyException e) {
				System.out.println(" 2 or 3 만 입력하세요");
			continue;	
			}
			catch(Exception e) {
				System.out.println("잘못된 메뉴입니다.");
				continue;
			}
			
			finally {
				kb.nextLine();
			}
			
			break;
		} // while 끝
			
		while(true) {
			
			System.out.println("이름을 입력하세요");
			String name = kb.nextLine();
			
			System.out.println("번호를 입력하세요");
			String phoneNumber = kb.nextLine();
			System.out.println("메일을 입력하세요");
			String email = kb.nextLine();
			

		
			try {
				
				if( name.trim().isEmpty() ||
						phoneNumber.trim().isEmpty() ||
						email.trim().isEmpty() )
				{ // if시작
					
					
					throw e;
					
				} // if 끝 
			} // try 끝
			catch(ErrorEmptyException e){
				System.out.println("공백없이 입력하시오.");
				continue;
			}
			
			break;
			
		}// while 끝
		
			
			String name = null;
			String phoneNumber = null;
			String email = null;
	
			switch(bunkivalue) { 
//			case choice.BASIC :
//				value = new PhoneBasic(name, phoneNumber, email);
//				break;
			case choice.UNIVER :
				System.out.println("전공을 입력하세요");
				String major= kb.nextLine();
				System.out.println("학년을 입력하세요");
				String year= kb.nextLine();
				value = new PhoneUnivInfor(name, phoneNumber, email, major, year);
				break;
			case choice.COMPANY:
				System.out.println("회사를 입력하세요");
				String company=kb.nextLine();
				value = new PhoneCompaanyInfor(name, phoneNumber, email, company);
				break;
			
			} // switch 끝
			

		arrayadd(value);
		
	} // addmethod 끝
	
	
	


	// 인덱스값 찾아놓자
	
	int searchIndex(String name) { // 인덱스찾는 메소드
		
		int index = -1; // 찾지못했을때 값 초기화
		
			for(int i=0; i<arraynum; i++) {
				if(info[i].name.equals(name)) {
					
				index = i;
				break;
		
		} // if 끝
		} // for 끝
			return index;
			
	} // searchIndex 끝
	
	
	void showmethod() { // 보여주기메소드
		
		for(int i=0; i<arraynum; i++) {
			info[i].showAllinfo();
		}
		
	} // show info 끝
	
	void searchmethod() { // 검색메소드 
		
		System.out.println("검색할 이름을 입력하세요 : ");
		String name = kb.nextLine();
		int search = searchIndex(name);
		
		
		if ( search<0) {
			System.out.println(" 검색한 데이터가 없습니다");
		}
		else {
			info[search].showAllinfo();			
		}
		
		
		
	} // search array 끝
	

	
	void deletemethod() {
		System.out.println("삭제할 이름을 입력하세요 : ");
		String name = kb.nextLine();
		int index=searchIndex(name);
		
		
		
		if (index<0) {
			System.out.println("검색한 데이터가 없습니다");
			
		}
		else  {
			
			for(int i=index; i<arraynum-1; i++) {
				info[i]= info[i+1]; // 뒤에값이 i로 저장됨
				
			}// for 끝
			arraynum --;
		}// else if 끝
		
		
	} // delete 끝
	
	
	void editmethod() {
		
		
		System.out.println("수정할 이름을 입력하세요 : ");
		String name = kb.nextLine();
		int editindex = searchIndex(name);
		
		
		String editname = info[editindex].name;
		
		if(editindex<0) {
			System.out.println("검색한 데이터가 없습니다");
			return;
		}
		else {
			
			System.out.println("수정하실 정보의 이름은 "+editname+"입니다");
			System.out.println("번호를 입력하세요");
			String phoneNumber = kb.nextLine();
			System.out.println("메일을 입력하세요");
			String email = kb.nextLine();
			
			PhoneBasic value = null;
			
			if(info[editindex] instanceof PhoneUnivInfor) {
				System.out.println("전공을 입력하세요");
				String major= kb.nextLine();
				System.out.println("학년을 입력하세요");
				String year= kb.nextLine();
				value = new PhoneUnivInfor(editname, phoneNumber, email, major, year);

			}

			else if (info[editindex] instanceof PhoneCompaanyInfor) {
				System.out.println("회사를 입력하세요");
				String company=kb.nextLine();
				value = new PhoneCompaanyInfor(editname, phoneNumber, email, company);
			}
//			else if(info[editindex] instanceof PhoneBasic) {
//				
//				value = new PhoneBasic(editname, phoneNumber, email);
//				
//			}
			
			info[editindex]=value;
			
		}// else 끝
		

		
	} // edit 끝 
	
	
} // 클래스 끝
