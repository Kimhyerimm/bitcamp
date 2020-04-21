import java.util.Scanner;

public class Phonelnfor {


		String name;
		String phoneNumber;
		String birthday;
	
		
		Phonelnfor(){
			
			
		}
		

		Phonelnfor(String name,String phoneNumber){
			this.name=name;
			this.phoneNumber=phoneNumber;
			
		}
		
		Phonelnfor(String name,String phoneNumber,String birthday){
			this.name = name;
			this.phoneNumber =phoneNumber;
			this.birthday=birthday;
			
		}

		
		
		

		void showInfo() {
			if( this.birthday==null) {
				System.out.println("이름 :"+this.name+" 번호 :"+this.phoneNumber);
			}else {
			System.out.println("이름 :"+this.name+" 번호 :"+this.phoneNumber+" 생일 :"+this.birthday);
			}
		}

	
}
