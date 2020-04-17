package test;

public class Boy {
//
//	철수와 영희는 구슬치기를 합니다.
//	철수는 구슬 10개/영희는 구슬20개 가지고있다.
//	구슬게임을 통해 구슬을 서로 주고받는다.
//
//	객체 : 영희, 철수 , 구슬
//	속성(상태) : 구슬의 개수
//	메서드 : 게임(구슬주고, 구슬받고)
	
		int numOfMarble; // 구슬 개수
		
		
		Boy(int num){
			numOfMarble =num;
		}
		
		
		void setMarble(int num) { // 구슬 개수 설정
			numOfMarble = num;
			
			
		}
		
		
		void gameWin(Boy boy,int num) { // 게임에서이겼을때 설정 
			numOfMarble = numOfMarble+num;   
			boy.numOfMarble = boy.numOfMarble -num ; 
			
		}
		
		void showData() {
			System.out.println("현재 보유한  구슬의 개수는 "+numOfMarble+"개 입니다");
			
		}

public static void main(String[] args) {
			
			//철수 생성
			Boy boy1 = new Boy(15);	
			//영희 생성
			Boy boy2 = new Boy(9);
			
			// 철수는 구슬 15개, 영희는 구슬 9개
//			boy1.setMarble(15);	
//			boy2.setMarble(9);
			System.out.println("철수는 구슬 "+boy1.numOfMarble+"보유, 영희는 구슬"+boy2.numOfMarble+ "9개 보유");
			
			System.out.println("--------------------");
		
			//1차 게임에서 어린이 1은 어리인 2의 구슬 2개를 획득한다
			System.out.println("1차 게임에서 철수는 영희의 구슬 2개를 획득한다");
			
			boy1.gameWin(boy2, 2);
			
			System.out.println("철수");
			boy1.showData();
			System.out.println("영희");
			boy2.showData();
			System.out.println("--------------------");
			
			//2차 게임에서 어린이2는 어린이1의 구슬 7개를 획득한다.
			System.out.println("2차 게임에서 영희는 철수의 구슬 7개를 획득한다.");
			
			boy2.gameWin(boy1, 7);
			
			
			System.out.println("철수");
			boy1.showData();
			System.out.println("영희");
			boy2.showData();
			System.out.println("--------------------");
			
		}
		
}
		

