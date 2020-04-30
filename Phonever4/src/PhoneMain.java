import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
	PhoneManager mana = new PhoneManager(50); // 정보 50개까지 저장가능
	
	while(true) {
		
	Menu.showMenu();
	
	Scanner kb = new Scanner(System.in);
	
	
	int choice = mana.kb.nextInt();
	
	
	switch(choice) {
	
	case 1: case 2: case 3: 
		mana.addPhone(choice);
		break;
	
	case 4:
		mana.searchInfo();
		break;
	case 5:
		mana.deleInfo();
		break;
	case 6:
		mana.showAllData();
		break;
	case 7:
		System.out.println("종료합니다");
		System.exit(0);
	}
	
	

	
	
	
	}

}
}
