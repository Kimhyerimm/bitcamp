package phonever3;

import java.util.Scanner;

/*
 ver 0.2키보드로 입력한값을 Infor에 가져다넣자
 
 ver 0.3

배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경. 

아래기능 삽입

저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제

데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.

 */
public class PhoneManager {

	
	
	
	// 1.폰인포를 배열로 만들고 배열에서 쓸 int 변수를 만들어놓자 
	
	final PhoneInfor[] pBooks; // 폰인포를 배열타입으로 만든 pbooks 변수 final로한이유는 배열을 못바꾸게? 
	Scanner kb; // 스캐너 kb 우선 만들어놈 메모리관리를 위해 아래에서 초기화하자
	int cnt; // 배열에 저장할 카운터값 
	
	// 2. 폰매니저를 초기화
	
	public PhoneManager() {
	
		pBooks= new PhoneInfor[100]; // pBooks를 100개로 초기화
		kb= new Scanner(System.in); // kb 초기화 여기서하는이유는 위에서하면 실행마다 계속 스캐너가만들어짐
		cnt = 0; // 카운터값을 0부터 시작할거니 0으로 초기화
	}
	
	
	// 버전2에서 썻던 폰인포에 저장할 값 스캐너
	PhoneInfor keyboard() {
		
		PhoneInfor value = null; // 폰인포에 넣을 변수 벨류지정해놓고 널값으로 우선 초기화
		
		
		System.out.println("이름을 입력하세요 : ");
		String name = kb.nextLine(); // 새로운 스트링 네임에 저장 [ 폰인포 스트링 네임 변수 아님 ]
		System.out.println("번호를 입력하세요 : ");
		String phoneNumber = kb.nextLine(); // 마찬가지 이 클래스의 폰넘버
		System.out.println("생일을 입력하세요. 안적어도됩니다 :  ");
		String birthday = kb.nextLine(); // 위와동일
		
		// 값 가져다넣기 생일을 안넣었을때가있으니 조건문으로 나누자
		if(birthday == null || birthday.trim().isEmpty()) { // trim = 양쪽의 공백을 빼줌
			// isEmpty = birthday의 length가 0이면 true로 반환시켜줌 공백도 문자열이니 위에 trim사용
			// 고로 isEmpty면 true니까 아래구문으로 시작
			value = new PhoneInfor(name, phoneNumber); // 폰인포에넣을 벨류변수 에 인스턴스화시킴 2개의 매개변수값만
		}
		else {
			value = new PhoneInfor(name, phoneNumber, birthday); // 3개의 매개변수값을 넣음
		}
		
		return value; // 리턴시켜 폰인포에 돌림
		
		
	}
	
	// 위에값들을 배열에 저장하는 메소드
	void addInfo() {
		
		pBooks[cnt] = keyboard(); // PhoneInfor타입 pBooks 배열 0번째에 위에 입력한 메소드 정보를 넣음
		cnt ++; // 키값[배열]을 한개씩 올려 주소값에 새로저장한다
		
	
	} // 저장메소드 끝
	
	// 검색 메소드
	// 검색-1 이름을 검색하고 검색한이름의 주소값을 반환시켜 주소값을 먼저 찾는다 
	// 이름값은 폰인포에있으니까 폰인포에 문자열을 비교하는 메소드먼저 작성후 아래에 오자.
	int searchInedx(String name) { // 주소값 리턴시켜야하니 int형식으로
		
		int srindex = -1; // 주소값은 0부터시작하니까 -1 로 초기화
		
		for(int i=0; i<cnt; i++) { // 0번째 배열부터 사용자가 입력한값 배열 cnt 까지 계속돌린다
			if(pBooks[i].checkName(name)) { // 만약 pBooks 배열 i값이 checkname 매개변수값과 같으면
				srindex = i; //서치인덱스를 i값으로 저장
				break;
			}	
		}
		return srindex; // i값으로 저장된 인덱스를 반환시킴
		
	} // int 서치인덱스 주소값찾기 끝
	
	
	
	// 검색메소드 시작 
	void searchInfo() { // 리턴값 없으니 void로 만들어주자
		
		System.out.println("검색할 이름을 입력");
		String name = kb.nextLine();
		
		int infoIndex = searchInedx(name); // infoIndex 새로운 변수에 위에 서치인덱스를 넣음
		
		if(infoIndex<0) { // 인덱스가 0보다 작으면 주소값자체가 없으니까 없다고표시해주자
			// 이경우에는 위에 서치인덱스 가 체크네임에서 펄스나오는경우 애초에 동일한이름이 없을때라고 생각
			System.out.println("검색한 데이터가 없습니다");
		}
		else { 
			pBooks[infoIndex].showInfo();
			
		}
		
	} // 검색메소드 끝 
	
	
	//삭제 메소드 시작
	void deleteInfo() {
		
		System.out.println("삭제할 이름을 입력");
		String name = kb.nextLine();
		
		
		
		int deindex = searchInedx(name); // 위에처럼 똑같이 주소값을 찾아서 새로운 deindex에 넣음
		
		//데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
		//재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.
		// -> // pBooks[2] : 삭제 , pBooks[2] = null
		
		if(deindex<0) {
			System.out.println("검색한 데이터가 없음 "); // 위와 똑같음
			// 인덱스가 0보다 작으면 주소값자체가 없으니까 없다고표시해주자
			// 이경우에는 위에 서치인덱스 가 체크네임에서 펄스나오는경우 애초에 동일한이름이 없을때라고 생각
		}
		
		else {
			for(int i=deindex; i<cnt-1; i++) { // i값을 검색과 동일한 인덱스값부터 시작해서 그 이름이 저장된cnt 위치까지 감
				// 원래 cnt 에 있는값을 주소값으로 생각해야하니까 -1 하며 검색
				pBooks[i]=pBooks[i+1]; // 이부분 잘 이해안감
			}
			
			cnt--; // 주소값 -1 처리되어 재저장 부분
			System.out.println("이름의 정보를 삭제함");
			
		}
		
	} // 삭제메소드 끝 
	
	
	
	// 이부분은 강사님이 새로해준부분 모든친구정보 보기
	
	void showAllInfo() {
		
		for(int i=0; i<cnt; i++) { // i값을 사용자가입력한 값들[cnt]까지 돌림
			pBooks[i].showInfo(); // 그 값들을 showinfo 메소드로 출력
		}
		
	} // 모든친구정보 메소드 끝
	
	
	
	
	
	
	
}
