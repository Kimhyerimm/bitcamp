import java.util.Scanner;

public class PhoneManager {

	// 정보가 담길 상위클래스를 배열로 만들자
	
	
	final PhoneMother[] pBooks; // 상위클래스 마더를 배엷타입 변수로 저장
	Scanner kb; // 스캐너도 저장해놓자 
	int cnt; // 배열에 저장된 개수
	
	
	
	public PhoneManager(int num){ // 초기화 시작하는데 크기를 직접 받아서 배열 생성 
		pBooks=new PhoneMother[num];
		cnt =0; 
		kb = new Scanner(System.in);
	}
	
	// 생성한 배열을 저장시키자
	void addPhoneInfo(PhoneMother value) {
		
		pBooks[cnt] =value;
		cnt ++;
	}
	
	
	
	
	// 1. 사용자에게 데이터를 분기로 받은후[ 대학 학교 가족 따로받아야하니까 ] 저장하자 
	
		void addPhone(int choice) {
			
		
		PhoneMother value = null; // 폰마더 타입의 새로운 변수 벨류를 널로 초기화 나중에 리턴할거니까
		
		System.out.println("이름을 입력하세요 : ");
		String name = kb.nextLine();  
		kb.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phoneNumber = kb.nextLine();
		System.out.println("주소를 입력하세요 : ");
		String address = kb.nextLine();
		System.out.println("이메일을 입력하세요 : ");
		String email=kb.nextLine();
		
		// 상위클래스는 다나왔고 이제 분기시키자
		
		if (choice==1) { // 대학친구일때 1을 누르게
			System.out.println("전공 입력하세요 : ");
			String major = kb.nextLine();
			System.out.println("학년을 입력하세요 : ");
			String year = kb.nextLine();
			value = new PhoneUnivInfo(name, phoneNumber, address, email, major, year);
			
		}else if(choice==2){ // 회사친구일때 2를 누르게
			System.out.println("회사를 입력하세요 : ");
			String company = kb.nextLine();
			value = new PhoneCompaanyInfo(name, phoneNumber, address, email, company);
		}else if(choice==3) { // 가족이면 3
			System.out.println("관계를 입력하세요 : ");
			String relationship=kb.nextLine();
			value = new PhoneFamilyInfor(name, phoneNumber, address, email, relationship);
			
		}
		
		addPhoneInfo(value); // 저장시키는 배열 매개변수에 위에 벨류값을 집어넣는다
		
	}
	
	
	// 삭제,찾기 하려면 인덱스값을 찾아야하니까 인덱스값 찾는 메소드 
		int searchIndex(String name) {
			int index = -1; // 주소값은 -1시작이니까 
			
			for(int i=0; i<cnt; i++) {
				if(pBooks[i].checkName(name)) {
					index=i;
					break;
				}
			}
			return index; // 네임이랑 똑같은걸 i값 배열에 반환
			
		} // 서치인덱스 주소찾기 끝 
	
		
		//검색메소드
	void searchInfo() { 
		System.out.println("검색할 친구 이름을 입력: ");
		String name=kb.nextLine();
		
		int infoIndex = searchIndex(name);
		if(infoIndex<0) {
		System.out.println("검색한 데이터가 없습니다");
		}else {
			pBooks[infoIndex].overriding();
		}	
	} // 찾기 끝
	
	
	// 삭제 메소드
	void deleInfo() {
		System.out.println("삭제할 친구 이름 입력 : ");
		String name =kb.nextLine();
		
		int deleIndex = searchIndex(name);
		if(deleIndex<0) {
			System.out.println("검색한 데이터가 없습니다");
			}else {
				for(int i=deleIndex; i<cnt-1; i++) {
					pBooks[i]=pBooks[i+1];
				}
				cnt--;
				System.out.println("이름의 정보를 삭제함");
			}
		
	} // 삭제메소드끝 
	

	
	
	// 친구 정보 상세 정보 출력 기능
	void showAllData() {
		System.out.println("친구의 모든 정보를 출력합니다.==========");
		for(int i=0; i<cnt; i++) {
			pBooks[i].overriding(); // 이부분이 오버라이딩 출력부분
			System.out.println("-------------------------");
		}
		
	}
	
	
	
}
