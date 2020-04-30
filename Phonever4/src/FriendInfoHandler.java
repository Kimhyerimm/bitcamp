//
//public class FriendInfoHandler {
//
//	private Friend[] myFriends; // Friend타입의 배열 선언
//	private int numOfFriend; // 저장된 친구의 정보 개수
//	Scanner kb;
//	
//	//초기화 : 저장공간(사이즈) 크기를 받아서 배열 생성
//	public FriendInfoHandler(int num) {
//		myFriends = new Friend[num]; 
//		numOfFriend=0;
//		kb=new Scanner(System.in);
//	}
//
//	
//	// 친구정보를 저장하는 기능
//	// 1. 배열에 저장하는 기능
//	// 2. 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스 생성
//	
//	// 1.배열에저장하는 기능
//	void addFriendInfo(Friend f) {
//		// 배열에 저장
//		//myFriends[]=f; -> myFriends[numOfFriend]=f;
//		myFriends[numOfFriend]=f;
//		numOfFriend++;
//	}
//	
//	
//	//2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
//	// HeighFriend , UnivFriend 분기로 나눠서 따로 인스턴스 해줘야함
//	
//	void addFriend(int choice) {
//		// 친구[최상위클래스] 기본정보 받기
//		// 여기서네임 폰넘버 어드레스는 상위클래스 프렌드값아니고 따로 여기서 메소드의 지역변수임
//		System.out.println("이름을 입력하세요");
//		String name = kb.nextLine(); 
//		System.out.println("전화번호를 입력하세요");
//		String phoneNumber = kb.nextLine();
//		System.out.println("주소를 입력하세요");
//		String address = kb.nextLine();
//		
//		Friend friend=null;
//		
//		// choice를 1로 받았을때 정보 메소드
//		if (choice==1) {
//			// HeighFiend 고딩친구 인스턴스 생성해주기
//			System.out.println("직업을 입력하세요");
//			String work = kb.nextLine();
//			friend = new HeighFriend(name, phoneNumber, address, work);
//		}
//		
//		
//		// choice를 2로 받았을때 정보 메소드
//		else if (choice==2) {
//			System.out.println("전공을 입력하세요");
//			String major = kb.nextLine();
//			System.out.println("학년을 숫자로 입력하세요");
//			String grade = kb.nextLine();
////			Integer.parseInt(grade);-> String으로 받아야하는거를 int형식으로바꿔줌
//			// 쓰는이유는 int로 받았는데 사용자가 문자입력하면 에러나서 예외처리해야함
//		// UnivFriend 대딩친구 인스턴스 생성해주기
//		friend = new UnivFriend(name, phoneNumber, address, major, Integer.parseInt(grade));
//		// UniveFriend에서 grade는 int형식인데 매개변수에서는 위에 String grade로받아야하니까 에러뜸
//		// 고로 Integer해줌
//		}
//		
//		
//		// addFriendInfo 호출
//		addFriendInfo(friend);	
//	}
//	
//	
//	// 친구 정보의 기본 정보 출력 기능
//	void showAllSimpleData() {
//		System.out.println("=======친구의 기본 정보를 출력합니다.========");
//		for(int i=0; i<numOfFriend; i++) {
//			myFriends[i].showBasicInfo();
//			System.out.println("----------------------------");
//		}
//	}
//	
//	
//	// 친구 정보 상세 정보 출력 기능
//	void showAllData() {
//		System.out.println("친구의 모든 정보를 출력합니다.==========");
//		for(int i=0; i<numOfFriend; i++) {
//			myFriends[i].showData(); // 이부분이 오버라이딩 출력부분
//			System.out.println("-------------------------");
//		}
//		
//	}