package ver5;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
//		ArrayInfo info = new ArrayInfo(100);
		ArrayInfo info = ArrayInfo.getSingle();
		
		int select=0;
		
		
		while(true) {
			Menu.show();
			try {
			select=info.kb.nextInt();
			
			if( ! (select >= bunki.ADD && select <=bunki.EXIT)) 
{
	
	ErrorEmptyException e = new ErrorEmptyException("1~6 사이의 숫자만 입력하세요.");
	
	throw e;
}
			
			
			
			} // try 끝 
			catch(InputMismatchException e){
				System.out.println("문자가 아닌 숫자를 입력하세요.");
				continue;
			} catch (ErrorEmptyException e) {
				System.out.println("1~6 사이의 숫자만 입력하세요.");
				continue;
			}
			catch(Exception e) {
				System.out.println("잘못된 메뉴입니다.");
				continue;
			}
			finally {
				info.kb.nextLine();	
			}
			
			
			
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
 