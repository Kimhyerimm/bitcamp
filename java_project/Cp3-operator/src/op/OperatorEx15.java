package op;

public class OperatorEx15 {

	public static void main(String[] args) {
		char c = 'a'; // char 타입 변수 c에 'a'저장 유니코드로는 97
		for(int i=0;i<26;i++) { // 반복돌림 i가 25일때까지 0부터 1씩더함
			System.out.println(c++); // for문 안에있으니까 97부터 후위형으로 i가 0부터25까지[총26번]조건 충족될때까지 1씩더함
			// char형식이니까 97 98 99 유니코드를 다시 char로바꿔서출력댐 걍 abcd 쭉올라감
		}
		
		System.out.println("-----------------"); // 줄바꿈
	c='A';  // c에 'A'저장
	for(int i=0;i<26;i++) {
		System.out.println(c++); // 똑같이 26번 c가 1씩더해지니까 대문자로 A~Z나옴
		}
	
	System.out.println("-----------------"); // 줄바꿈
	
	c='0';
	for(int i=0;i<10;i++) {
		System.out.println(c++); // 0부터 9까지 10번 c값이 1씩더해짐 
	}
		

	}

}
