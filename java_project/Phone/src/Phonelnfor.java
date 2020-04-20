import java.util.Scanner;

public class Phonelnfor {

	
//	String[] name=new String[999];
//	String[] phoneNumber = new String[999];
//	String[] birthday = new String[999];

		static String name;
		static String phoneNumber;
		static String birthday;
	
	public Phonelnfor(String name,String phoneNumber, String birthday){
				Phonelnfor.name = name;
				Phonelnfor.phoneNumber = phoneNumber;
				Phonelnfor.birthday =birthday;
			}
	
	
		public void UserInput() {
			
			for(int i=0; ; i++) {
				
			
			
			Scanner scanName= new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			String name1 = scanName.nextLine();
			
			
			
			
			Scanner scanNumber= new Scanner(System.in);
			System.out.println("번호을 입력하세요");
			String phoneNumber1 = scanNumber.nextLine();
			
			Scanner scanbirtday= new Scanner(System.in);
			System.out.println("생일을 입력하세요");
			String birthday1 = scanbirtday.nextLine();
			
			System.out.printf("이름은 %s 번호는 %s 생일은 %s입니다 \n",name1,phoneNumber1,birthday1);
			
			
		}
		
		}
	public void show() {
		
		System.out.println("이름은 :"+name+"번호는 :"+phoneNumber+"생일은 :"+birthday);
	
	}
	



	
}
