package phonever3;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneInfor value = null; // 매니저에서와 똑같이 폰인포 새로운 변수 벨류 만들어 아무것도없는거로 초기화ㅣ시켜놈
		PhoneManager mana = new PhoneManager(); // 인스턴스화시킴
		
		
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			
			// Menu에서 static으로 메소드로 썼기때문에 따로 인스턴스안하고 바로호출가능[같은 패키지안에서 쓸수있음 ]
			Menu.showMenu();
			
//			value = mana.keyboard(); // 폰인포 벨류값에 매니저 키보드메소드를 적용시킴
//			value.showInfo(); // 폰인포에있는 쇼인포 메소드를통해 위에 저장된값을 출력 
			// 위에 2줄 ver2버전에서 쓰던 계속 입력받고 계속출력 이제 필없음
			
			
			int select = sc.nextInt();
			
			sc.nextLine(); // 한칸띄워주기 안쓰면 이름 생략해버림
			
			switch(select) { // 스위치문으로 1~5번 조건줌 
			
			case 1:
				mana.addInfo();
				break;
			case 2:
				mana.searchInfo();
				break;
			case 3:
				mana.deleteInfo();
				break;
			case 4:
				mana.showAllInfo();
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.out.println(0);
			}
			
		}
		
		
	}

}
