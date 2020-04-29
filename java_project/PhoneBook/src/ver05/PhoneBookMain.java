package ver05;

import java.util.InputMismatchException;
import java.util.Scanner;

import ver05.exception.BadNumberException;

public class PhoneBookMain {

	public static void main(String[] args) {
		
//		PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			Menu.showMenu();
			
			int select=0;
			
			try {
			select=manager.kb.nextInt();
			
			//정상범위 1~6
			if(!(select >= MenuNum.INSERT && select <=MenuNum.EXIT)) {
				BadNumberException e =new BadNumberException();
			
			// 강제적인 예외 발생
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
			
			
		
			
			switch(select) {
			case MenuNum.INSERT:
				manager.createInfo();
				break;
			case MenuNum.SEARCH:
				manager.showInfo();
				break;
			case MenuNum.DELETE:
				manager.deleInfo();
				break;
			case MenuNum.EDIT:
				manager.editInfo();
				break;
			case MenuNum.PRINT_ALl:
				manager.showAllInfo();
				break;
				
			case MenuNum.EXIT:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				return;
			}
			
			
		}

	}

}
