package friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendInfoHandler {

	//20.04.28 싱글톤 처리 추가
	/* manager 클래스의 싱글턴 패턴 처리
		1. 생성자 접근제어지시자 : private
			->  인스턴스 생성 막는다
			- 공동으로 사용할 인스턴스 생성 : static private
		 	-참조변수 반환 메서드 : static public 
	 

2. interface 기반의 상수 표현, 메뉴표현

3. interface -> 추상클래스 -> 상속 관계 구조로 변경
21~ 25줄추가 프렌드메인 8번줄 추가
*/

 // 2020. 05. 01
 // 배열에 저장 -> List 이용



private static FriendInfoHandler handler = new FriendInfoHandler(100);
	
	public static FriendInfoHandler getInstance() {
		return handler;
	}
	
	
	
	
	
	
	// Friend 타입의 정보를 저장할 배열을 가진다.
	// 친구정보를 저장하는 기능
	// 친구정보의 기본 정보 출력 기능
	// 친구정보 상세 정보 출력
	
	
//	private Friend[] myFriends; // Friend타입의 배열 선언
	
	//List 참조변수
	private ArrayList<Friend> myFriends;
	
//	 private int numOfFriend; // 저장된 친구의 정보 개수
	Scanner kb;
	
	
	
	
	
	//초기화 : 저장공간(사이즈) 크기를 받아서 배열 생성
	private FriendInfoHandler(int num) {
//		myFriends = new Friend[num]; 
//		numOfFriend=0;
		
		// ArrayList 인스턴스 생성
		myFriends = new ArrayList<Friend>();
		kb=new Scanner(System.in);
	}

	
	
	
	
	// 친구정보를 저장하는 기능
	// 1. 배열에 저장하는 기능
	// 2. 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스 생성
	
	// 1.배열에저장하는 기능
	void addFriendInfo(Friend f) {
		// 배열에 저장
		//myFriends[]=f; -> myFriends[numOfFriend]=f;
//		myFriends[numOfFriend]=f;
//		numOfFriend++;
		
		myFriends.add(f);
		
	}
	
	
	//2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	// HeighFriend , UnivFriend 분기로 나눠서 따로 인스턴스 해줘야함
	
	void addFriend(int choice) {
		// 친구[최상위클래스] 기본정보 받기
		// 여기서네임 폰넘버 어드레스는 상위클래스 프렌드값아니고 따로 여기서 메소드의 지역변수임
		// 예외처리할때 만약 아래 length가 0이거나 equls 그 구문
		System.out.println("이름을 입력하세요");
		String name = kb.nextLine(); 
		System.out.println("전화번호를 입력하세요");
		String phoneNumber = kb.nextLine();
		System.out.println("주소를 입력하세요");
		String address = kb.nextLine();
		
		Friend friend=null;
		
		// choice를 1로 받았을때 정보 메소드
		if (choice==1) {
			// HeighFiend 고딩친구 인스턴스 생성해주기
			System.out.println("직업을 입력하세요");
			String work = kb.nextLine();
			friend = new HeighFriend(name, phoneNumber, address, work);
		}
		
		
		// choice를 2로 받았을때 정보 메소드
		else if (choice==2) {
			System.out.println("전공을 입력하세요");
			String major = kb.nextLine();
			System.out.println("학년을 숫자로 입력하세요");
			String grade = kb.nextLine();
//			Integer.parseInt(grade);-> String으로 받아야하는거를 int형식으로바꿔줌
			// 쓰는이유는 int로 받았는데 사용자가 문자입력하면 에러나서 예외처리해야함
		// UnivFriend 대딩친구 인스턴스 생성해주기
		friend = new UnivFriend(name, phoneNumber, address, major, Integer.parseInt(grade));
		// UniveFriend에서 grade는 int형식인데 매개변수에서는 위에 String grade로받아야하니까 에러뜸
		// 고로 Integer해줌
		}
		
		
		// addFriendInfo 호출
		addFriendInfo(friend);	
	}
	
	
	// 친구 정보의 기본 정보 출력 기능
	void showAllSimpleData() {
		System.out.println("=======친구의 기본 정보를 출력합니다.========");
		for(int i=0; i<myFriends.size(); i++) {
			myFriends.get(i).showBasicInfo();
			System.out.println("----------------------------");
		}
	}
	
	
	// 친구 정보 상세 정보 출력 기능
	void showAllData() {
		System.out.println("친구의 모든 정보를 출력합니다.==========");
		for(int i=0; i<myFriends.size(); i++) {
			myFriends.get(i).showData(); // 이부분이 오버라이딩 출력부분
			System.out.println("-------------------------");
		}
		
	}
	
	
	
	
	
	
}
