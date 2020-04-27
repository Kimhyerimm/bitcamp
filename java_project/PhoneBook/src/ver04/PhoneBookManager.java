package ver04;


import java.util.Scanner;

//PhoneInfo 타입의 배열로 친구들의 정보를 저장, 수정, 삭제, 검색, 출력
public class PhoneBookManager {

	// 1. 배열생성
	// 2. 배열에 정보 저장
	// 3. 배열에 저장된 정보 출력
	// 4. 배열의 정보 검색 : 이름 기준
	// 5. 배열의 정보를 삭제 : 이름 기준
	// 6. 배열의 정보를 수정 : 이름 기준 
	
	
	// 1. 배열 선언
	
	PhoneInfor[] books;
	int numOfInfo; // 배열에 저장된 요소의 개수 
	Scanner kb;
	
	
	// 생성자를 통해서 배열 생성, 요소 개수 초기화
	public PhoneBookManager(int num) {
		// 배열의 생성 
		books= new PhoneInfor[num];
		// 요소 개수의 초기화
		numOfInfo = 0;
		kb = new Scanner(System.in);
	}
	
	// 2. 배열에 정보 저장
	// 2-1) 배열에 넣는 처리
	// 2-2) 사용자로부터 받은 데이터로 인스턴스 생성
	
	// 2-1) 배열에 넣는 처리
	void addInfo(PhoneInfor info) {
		// 배열에 numOfInfo 숫자 -> index 로 참조값을 저장 
		books[numOfInfo] = info;
		// 입력된 정보의 개수를 +1 증가시킴
		numOfInfo++;
	}
	
	// 저장 메소드
	void createInfo() { 

		System.out.println("1. 일반 2. 대학 3. 회사 4. 동호회");

		System.out.println("입력하고자 하는 번호를 입력하세요 :" );
		
		int select = kb.nextInt();
		kb.nextLine();
		
		// 사용자 선택 번호
//		int select =Integer.parseInt(kb.nextLine()); // 49,50번을 한번에 통합하는법
		
		if (! (select>0 && select<5)) {
			System.out.println("정상적인 메뉴 선택이 아닙니다. \n");
			return;
		}
		
		// 2-1-1) 기본정보 수집 : 이름, 번호 , 주소 , 이메일
		
		System.out.println("이름을 입력하세요 :");
		String name=kb.nextLine();
		System.out.println("번호를 입력하세요 :");
		String phoneNumber=kb.nextLine();
		System.out.println("주소를 입력하세요 :");
		String addr=kb.nextLine();
		System.out.println("이메일을 입력하세요 :");
		String email=kb.nextLine();
		
		PhoneInfor info = null;
		
		switch(select) {
			case 1: // 2-1-2) 기본 클래스로 인스턴스 생성
				 info = new PhoneInfor(name, phoneNumber, addr, email);
				break;
			case 2:// 2-1-3) 대학 클래스로 인스턴스 생성
				System.out.println("전공을 입력하세요 : ");
				String major=kb.nextLine();
				System.out.println("학년을 입력하세요 : ");
				String grade = kb.nextLine();
				info = new PhoneUnivInfor(name, phoneNumber, addr, email, major, grade);
				break;
			case 3: // 2-1-4) 회사 클래스로 인스턴스 생성
				System.out.println("회사를 입력하세요 : ");
				String company = kb.nextLine();
				System.out.println("부서를 입력하세요 :");
				String dept = kb.nextLine();
				System.out.println("직급을 입력하세요 :");
				String job = kb.nextLine();
				info = new PhoneCompanyInfo(name, phoneNumber, addr, email, company, dept, job);
				break;
			case 4: // 2-1-5) 동호회 클래스로 인스턴스 생성
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
				
		} // switch 끝
		
		// 2-2) 사용자로부터 받은 데이터로 인스턴스 생성
		// 2-3) 생성된 인스턴스를 배열에 저장
		addInfo(info);
		
	} // createInfo 끝
	
	
	
	// 3. 배열에 저장된 정보 출력
	void showAllInfo() {
		// for each 반복 : 현재 프로그램에서는 사용불가 수정하다가 겹쳐야하는데 공백까지갈수있으므로
		// for 반복문 : 반복의 횟수 지정이 가능 numofInfo
		
		System.out.println("전체 정보를 출력합니다. =============");
		for(int i=0; i<numOfInfo; i++) {
			books[i].showAllInfo();
			System.out.println("------------------------------");
		}
	} // showAllinfo 끝
	

	// 번외. 배열의 index검색 : 인스턴스의 name 기준
	int searchIndex(String name) {
		
		int searchIndex = -1; // 정상적인 index값은 0~이상의값 , 찾지 못했을때 구분값 -1 사용
		
		// 배열의 반복으로 name 값을 비교해서 index값을 찾난ㄷ,
		
for(int i=0; i<numOfInfo; i++) {
	if(books[i].name.equals(name)){
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
		books[index].showBasicInfo();
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
			for(int i=index; i<numOfInfo-1; i++) {
				books[i] = books[i+1];
			}
			// 삭제가 되었으므로 요소의 개수 -1
			numOfInfo--;
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
			
			String editname = books[index].name; // 네임을 고정?
			
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
			
			if(books[index] instanceof PhoneUnivInfor) {
				System.out.println("전공을 입력해주세요 : ");
				String major = kb.nextLine();
				System.out.println("학년을 입력해주세요 : ");
				String grade = kb.nextLine();
				info=new PhoneUnivInfor(editname, phoneNumber, addr, email, major, grade);
			}
			else if(books[index] instanceof PhoneCompanyInfo) {
				System.out.println("회사 이름을 입력해주세요 : ");
				String company = kb.nextLine();
				System.out.println("부서를 입력해주세요 : ");
				String dept = kb.nextLine();
				System.out.println("직급을 입력해주세요 : ");
				String job = kb.nextLine();
				info=new PhoneCompanyInfo(editname, phoneNumber, addr, email, company, dept, job);
			}
			else if(books[index] instanceof PhoneCafeInfo) {
				System.out.println("동호회 이름을 입력해주세요 : ");
				String cafeName = kb.nextLine();
				System.out.println("동호회 닉네임을 입력해주세요 : ");
				String nickName=kb.nextLine();
				info=new PhoneCafeInfo(editname, phoneNumber, addr, email, cafeName, nickName);
			}
			else if(books[index] instanceof PhoneInfor) {
				info=new PhoneInfor(editname, phoneNumber, addr, email);
			//배열에 새로운 인스턴스를 저장
			books[index]=info;
			
		} // 상위 else 끝 
	}// editInfo 끝
	
	
	
	
	
	}	
}
