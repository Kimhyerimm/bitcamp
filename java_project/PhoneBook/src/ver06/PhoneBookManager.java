package ver06;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ver05.exception.BadNumberException;
import ver05.exception.StringEmptyException;

//PhoneInfo 타입의 배열로 친구들의 정보를 저장, 수정, 삭제, 검색, 출력
public class PhoneBookManager {

	// 1. 배열생성
	// 2. 배열에 정보 저장
	// 3. 배열에 저장된 정보 출력
	// 4. 배열의 정보 검색 : 이름 기준
	// 5. 배열의 정보를 삭제 : 이름 기준
	// 6. 배열의 정보를 수정 : 이름 기준 
	
	
	// 1. 배열 선언
	
//	PhoneInfor[] books;
//	int numOfInfo; // 배열에 저장된 요소의 개수 
	Scanner kb;
	
	
	private ArrayList<PhoneInfor> books;
	
	
	
//	private static PhoneBookManager manager = new PhoneBookManager(100);
	
//	public static PhoneBookManager getInstance() {
//		// TODO Auto-generated method stub
//		return manager;
//	}	
	
	// 생성자를 통해서 배열 생성, 요소 개수 초기화
	private  PhoneBookManager(int num) {
		// 배열의 생성 
		books= new ArrayList<PhoneInfor>();
		// 요소 개수의 초기화
//		numOfInfo = 0;
		kb = new Scanner(System.in);
	}
	
	 private static PhoneBookManager manager = new PhoneBookManager(100);
	
	 public static PhoneBookManager getInstance() {
	 return manager;
	 }
	
	 
	// 2. 배열에 정보 저장
	// 2-1) 배열에 넣는 처리
	// 2-2) 사용자로부터 받은 데이터로 인스턴스 생성
	
	// 2-1) 배열에 넣는 처리
	void addInfo(PhoneInfor info) {
		// 배열에 numOfInfo 숫자 -> index 로 참조값을 저장 
//		books[numOfInfo] = info;
//		// 입력된 정보의 개수를 +1 증가시킴
//		numOfInfo++;
		
		books.add(info);
	}
	
	// 저장 메소드
	void createInfo() { 

		
//		System.out.println(" "+Menuinter.UNIV+". 대학 "+Menuinter.COMPANY+". 회사 "+Menuinter.CAFE+". 동호회");
		
		
		int select=0;
		
		while(true) {
			
			System.out.println(" 1. 대학 2. 회사 3. 동호회");
			System.out.println("입력하고자 하는 번호를 입력하세요 :" );
			
			try {
			select = kb.nextInt();
			
			// 정상범위 1~3
			if ( ! (select >=1 && select <=3 )) {
				BadNumberException e = new BadNumberException();
				
				//강제 예외발생
				throw e;
			}
			}
			
			
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
//				manager.kb.nextLine(); 
				// 위에주석처리하면 아래 finally 추가 해줘야함 한칸띄워야하니까
				continue;
			} 
			
			catch(BadNumberException e) {
				System.out.println("메뉴범위를 벗어난 숫자입니다 다시입력하세요");
				continue;
			}
			
			
			catch(Exception e) {  // 그외 나머지 모든 에러는 아래로처리
				System.out.println("잘못된 메뉴입니다");
//				manager.kb.nextLine(); 
				// 위에주석처리하면 아래 finally 추가 해줘야함 한칸띄워야하니까
				continue;
			} // 25~ 30줄 20~ 24랑 똑같은데 오류범위를 더 넓힌거임 Exception아래 inputMis~~~있음
			finally {
				manager.kb.nextLine();
			}
			
			break;
			
		}
		// 사용자 선택 번호
//		int select =Integer.parseInt(kb.nextLine()); // 49,50번을 한번에 통합하는법
		
		if (! (select>0 && select<5)) {
			System.out.println("정상적인 메뉴 선택이 아닙니다. \n");
			return;
		}
		
		// 2-1-1) 기본정보 수집 : 이름, 번호 , 주소 , 이메일
		PhoneInfor info = null;
		String name=null, phoneNumber=null, addr=null, email=null;
		
		while(true) {
			
		System.out.println("이름을 입력하세요 :");
		name=kb.nextLine();
		System.out.println("번호를 입력하세요 :");
		phoneNumber=kb.nextLine();
		System.out.println("주소를 입력하세요 :");
		addr=kb.nextLine();
		System.out.println("이메일을 입력하세요 :");
		email=kb.nextLine();
		
		try {
		if(name.trim().isEmpty()|| phoneNumber.trim().isEmpty() || addr.trim().isEmpty() || email.trim().isEmpty())
			// trim.isEmpty 공백제외후 empty
		{
			StringEmptyException e = new StringEmptyException();
			throw e;
			
		}
		} // try 끝
		
		catch (StringEmptyException e) {
			System.out.println("기본 정보는 공백없이 모두 입력하세요 ");
			System.out.println("다시 입력해주세요 \n");
			continue;
		}
		
		break ;
		} // while 끝
		
		
		switch(select) {
//			case 1: // 2-1-2) 기본 클래스로 인스턴스 생성
//	
//				 info = new PhoneInfor(name, phoneNumber, addr, email);
//				break;
			case MenuNum.UNIV:// 2-1-3) 대학 클래스로 인스턴스 생성
//		case Menuinter.UNIV :
				System.out.println("전공을 입력하세요 : ");
				String major=kb.nextLine();
				System.out.println("학년을 입력하세요 : ");
				String grade = kb.nextLine();
				
				info = new PhoneUnivInfor(name, phoneNumber, addr, email, major, grade);
				break;
				
				
				
				
				
			case MenuNum.COMPANY: // 2-1-4) 회사 클래스로 인스턴스 생성
//		case Menuinter.COMPANY :
				System.out.println("회사를 입력하세요 : ");
				String company = kb.nextLine();
				System.out.println("부서를 입력하세요 :");
				String dept = kb.nextLine();
				System.out.println("직급을 입력하세요 :");
				String job = kb.nextLine();
				info = new PhoneCompanyInfo(name, phoneNumber, addr, email, company, dept, job);
				break;
			case MenuNum.CAFE: // 2-1-5) 동호회 클래스로 인스턴스 생성
//		case Menuinter.CAFE :
				System.out.println("동호회 이름을 입력하세요 :");
				String cafeName=kb.nextLine();
				System.out.println("동호회 닉네임을 입력하세요 : ");
				String nickName=kb.nextLine();
				info = new PhoneCafeInfo(name, phoneNumber, addr, email, cafeName, nickName);
				break;

				
//			default :
//				System.out.println("정상적인 메뉴 선택이 아닙니다. \n");
//				return ;
// 58~60줄로 대체
				
	
		} // while 끝
		// 2-2) 사용자로부터 받은 데이터로 인스턴스 생성
		// 2-3) 생성된 인스턴스를 배열에 저장
		addInfo(info);
		
	} // createInfo 끝
	
	
	
	// 3. 배열에 저장된 정보 출력
	public void showAllInfo() {
		// for each 반복 : 현재 프로그램에서는 사용불가 수정하다가 겹쳐야하는데 공백까지갈수있으므로
		// for 반복문 : 반복의 횟수 지정이 가능 numofInfo
		
		System.out.println("전체 정보를 출력합니다. =============");
		for(int i=0; i<books.size(); i++) {
			books.get(i).showAllInfo();
			System.out.println("------------------------------");
		}
	} // showAllinfo 끝
	

	// 번외. 배열의 index검색 : 인스턴스의 name 기준
	int searchIndex(String name) {
		
		int searchIndex = -1; // 정상적인 index값은 0~이상의값 , 찾지 못했을때 구분값 -1 사용
		
		// 배열의 반복으로 name 값을 비교해서 index값을 찾난ㄷ,
		
for(int i=0; i<books.size(); i++) {
	if(books.get(i).name.equals(name)){
	searchIndex=i;
	break;
	}
}
	
		
		return searchIndex;
	}
	
	
	// 4. 배열의 정보 검색 : 이름[인덱스] 기준
	void showInfo() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String name= kb.nextLine();
		
		int index = searchIndex(name);
		if(index<0) {
			System.out.println("검색한 정보가 없습니다");
		}else {
			System.out.println("---------------------------");
		books.get(index).showBasicInfo();
		System.out.println("---------------------------");
		}
	} // showInfo 끝 
	
	
	// 5. 배열의 정보를 삭제 : 이름[인덱스] 기준
	void deleInfo() {
		System.out.println("삭제할 정보를 입력하세요 : ");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		if(index<0) {
			System.out.println("삭제할 정보가 없습니다");
		} else {
			// 삭제 위치에서 왼쪽으로 시프트
//			for(int i=index; i<; i++) {
//				books[i] = books[i+1];
//			}
			books.remove(index);
			
			// 삭제가 되었으므로 요소의 개수 -1
//			numOfInfo--;
		}
	} // deleinfo 끝 
	
	
	// 6. 배열의 정보를 수정 : 이름 기준  ★★★★★
	void editInfo() {
		System.out.println("변경할 이름을 입력하세요 :");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다");
			return;
		}else {
			
			String editname = books.get(index).name; // 네임을 고정?
			
			System.out.println("수정 데이터 입력을 시작합니다");
			System.out.println("이름은 "+ editname+"입니다.");
			System.out.println("번호를 입력하세요 : ");
			String phoneNumber = kb.nextLine();
			System.out.println("주소를 입력하세요 : ");
			String addr= kb.nextLine();
			System.out.println("이메일을 입력하세요 : ");
			String email=kb.nextLine();
			
			PhoneInfor info = null;
			
			
			// 저장된 인스턴스가 : 기본인지 대학,회사,동호회 인지 
			
			if(books.get(index) instanceof PhoneUnivInfor) {
				System.out.println("전공을 입력해주세요 : ");
				String major = kb.nextLine();
				System.out.println("학년을 입력해주세요 : ");
				String grade = kb.nextLine();
				info=new PhoneUnivInfor(editname, phoneNumber, addr, email, major, grade);
			}
			else if(books.get(index) instanceof PhoneCompanyInfo) {
				System.out.println("회사 이름을 입력해주세요 : ");
				String company = kb.nextLine();
				System.out.println("부서를 입력해주세요 : ");
				String dept = kb.nextLine();
				System.out.println("직급을 입력해주세요 : ");
				String job = kb.nextLine();
				info=new PhoneCompanyInfo(editname, phoneNumber, addr, email, company, dept, job);
			}
			else if(books.get(index) instanceof PhoneCafeInfo) {
				System.out.println("동호회 이름을 입력해주세요 : ");
				String cafeName = kb.nextLine();
				System.out.println("동호회 닉네임을 입력해주세요 : ");
				String nickName=kb.nextLine();
				info=new PhoneCafeInfo(editname, phoneNumber, addr, email, cafeName, nickName);
			}
//			else if(books[index] instanceof PhoneInfor) {
//				info=new PhoneInfor(editname, phoneNumber, addr, email);
			//배열에 새로운 인스턴스를 저장
			books.remove(index);
			books.add(index, info);
			
			
		} // 상위 else 끝 
	}// editInfo 끝
	
	
	
	
	
	}

	

