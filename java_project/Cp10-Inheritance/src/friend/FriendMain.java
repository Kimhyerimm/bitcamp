package friend;

public class FriendMain {

	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		while(true) {
			System.out.println("==========메뉴를 선택하세요=========");
			System.out.println("1. 고교친구저장");
			System.out.println("2. 대학친구저장");
			System.out.println("3. 친구 기본 정보 출력");
			System.out.println("4. 친구 전체 정보 출력");
			System.out.println("5. 종료");
			System.out.println("================================");
			
			
			int choice = handler.kb.nextInt();
			
//			handler.kb.nextLine(); // 앞의 버퍼를 클리어 하는 목적??
//			
			switch(choice) {
			case 1:
				handler.addFriend(choice);
				break;
			case 2:
				handler.addFriend(choice);
				break;
				
				// 1이랑 2랑 같으니까 case 1: case 2:
								//handler~~ 해줘도됨
			case 3:
				handler.showAllSimpleData();
				break;
			case 4:
				handler.showAllData();
				
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // or return;
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
