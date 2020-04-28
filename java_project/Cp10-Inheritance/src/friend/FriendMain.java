package friend;

public class FriendMain {

	public static void main(String[] args) {
		
//		FriendInfoHandler handler = new FriendInfoHandler(10);
		FriendInfoHandler handler = FriendInfoHandler.getInstance();
		
		while(true) {
			System.out.println("==========메뉴를 선택하세요=========");
			System.out.println(" "+Menu.INSERT_HEIGH+" 고교친구저장");
			System.out.println(" "+Menu.INSERT_UIVE+" 대학친구저장");
			System.out.println(" "+Menu.PRINT_BASIC+" 친구 기본 정보 출력");
			System.out.println(" "+Menu.PRINT_ALL+" 친구 전체 정보 출력");
			System.out.println(" "+Menu.EXIT+" 종료");
			System.out.println("================================");
			
			int choice=0;
			
			try {
				
			choice = handler.kb.nextInt();
			// InputMismatchException 인스턴스 전달
			//아래가 1~5이외 다른문자입력했을때
			} catch(ExceptionInInitializerError e) { 
				System.out.println("정상적인 메뉴의 번호 입력이 되지 않았습니다.");
				System.out.println("메뉴를 다시 입력해주세요.");
				handler.kb.nextLine(); // 이 클래스에서는 while이므로 계속 무한반복되니까 이걸써줘야함
				continue;
			} catch(Exception e) { // 사용자예외
				System.out.println("예외 발생");
				handler.kb.nextLine();
			}
			
			
			
			handler.kb.nextLine(); // 앞의 버퍼를 클리어 하는 목적??
			// 위에 주석처리해서해보니까 이름을 바로건너띈다음에 저장됨
			
			// 이쪽을 try로 묶자 그전에 핸들러에서 예외처리 후에 위에 while로 돌리자
			switch(choice) {
//			case 1:
			case Menu.INSERT_HEIGH :
				handler.addFriend(choice);
				break;
//			case 2:
			case Menu.INSERT_UIVE :
				handler.addFriend(choice);
				break;
				
				// 1이랑 2랑 같으니까 case 1: case 2:
								//handler~~ 해줘도됨
//			case 3:
			case Menu.PRINT_BASIC : 
				handler.showAllSimpleData();
				break;
//			case 4:
			case Menu.PRINT_ALL :
				handler.showAllData();
				
				
//			case 5:
			case Menu.EXIT :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // or return;
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
