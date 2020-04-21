/*
회원정보 ( 아이디 , 이름 , 이메일 ) * 5 
배열에 저장하고,
회원의 정보를 리스트로 출력
1. class Member 
2. Member[] arr = new member[5]
arr[0]=주소값.new Member()
3. 클래스안 속성 , 기능 메소드
4. arr[0].memberId
*/

package membership;


// 회원 정보를 저장하기 위한 클래스 생성
public class Member { 
//인스턴스[멤버 변수]
	String memberId;
	String memberName;
	String memberEmail;
	
	
	// 생성자 [ 이름 클래스이름으로 ]
	Member(String memberId, String memberName, String memberEmail){ // 지역변수
		this.memberId=memberId;
		this.memberName=memberName;
		this.memberEmail=memberEmail;
		
	}
	
	void showInfo() {
		
		System.out.println("아이디 :"+this.memberId);
		System.out.println("이름 : "+this.memberName);
		System.out.println("이메일 :"+this.memberEmail);
		
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}
	
	
}
