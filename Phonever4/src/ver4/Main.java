package ver4;


public class Main {

	public static void main(String[] args) {
		
		ArrayInfo info = new ArrayInfo(100);
		
		
		int select;
		
		
		while(true) {
			Menu.show();
			
			select=info.kb.nextInt();
			info.kb.nextLine();
			
			
			switch(select) {
			
			case bunki.ADD:
				info.addmethod();
				break;
			case bunki.SHOWINFO :
				info.showmethod();
				break;
			case bunki.SEARCH:
				info.searchmethod();
				break;
			case bunki.DELETE:
				info.deletemethod();
				break;
			case bunki.EDIT:
				info.editmethod();
				break;
			case bunki.EXIT:
				System.out.println("종료합니다");
				System.exit(0);
				
			
			} // switch 끝
			
			
			
		} // while 끝
		
		
	} // mail 끝

} // calss 끝
 