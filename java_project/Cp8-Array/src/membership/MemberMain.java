package membership;

public class MemberMain {

	public static void main(String[] args) {
		
		
		// 회원 정보 5개를 저장 할 수 있는 배열을 생성
		// Member 타입의 인스턴스의 참조값을 저장하는 메모리 공간
		// Member m1, m2, m3, m4, m5
		Member[] members = new Member[5]; 
		
		members[0]= new Member("COOL","시원한","cool@naver.com") ; 
		members[1]= new Member("HOT","뜨거운","hot@naver.com") ; 
		members[2]= new Member("son","손흥민","son@gmail.com") ; 
		members[3]= new Member("park","박지성","park@naver.com") ; 
		members[4]= new Member("kim","김연아","kim@daum.net") ;
		
//		members[0].showInfo();
//		members[1].showInfo();
//		members[2].showInfo();
//		members[3].showInfo();
//		members[4].showInfo();


		for(int i=0; i<members.length; i++) {
			System.out.println(members[i]); // toString형식으로 나옴
			 

			
		}
		
		System.out.println("--------------");
		
		for(int i=0; i<members.length; i++) {
		
			
			members[i].showInfo();
			
		}
		
		
		System.out.println("--------------");
		
		
		
		
		
		
		Member sc = new Member("qhrua6789","김보겸","namastae112@gmail.com");
		
		sc.showInfo();
		System.out.println("--------------");
		System.out.println(sc); // sc.toString() 호출
	
	}

}
