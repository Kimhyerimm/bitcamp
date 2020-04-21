import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		
		
//		Phonelnfor version1 = new Phonelnfor("아무개", "119112114", "951124");
//		Phonelnfor version2 = new Phonelnfor("홍길동", "010112");
		Phonelnfor version3 = new Phonelnfor();
		
//		version1.showInfo();
//		version2.showInfo();

//		version3.inPut();
		
		

		
		void inPut() {
			
			while(true) {
			
			Scanner sc = new Scanner(System.in);
				
			System.out.println("이름을 입력하세요 :");
			this.name = sc.nextLine();
			
			System.out.println("번호를 입력하세요 :");
			this.phoneNumber = sc.nextLine();
			
			System.out.println("생일을 입력하세요 :");
			this.birthday = sc.nextLine();
			
			
			
			showInfo();
			
			}
					
		}
		
		
		
		
		
		
	}

}
