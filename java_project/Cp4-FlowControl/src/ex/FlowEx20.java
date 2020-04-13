package ex;

public class FlowEx20 {

	public static void main(String[] args) {
		System.out.println("자, 이제 카운트다운을 시작합니다.");
		// 위에 걍 그대로출력
		for(int i=10; i >= 0; i--) {
		// i는 10부터 0과 같아질때까지 i값 1씩 빼기
		for(int j = 0; j < 1000000000; j++) {
		// 얘는 왜하는지 모르겠음 암튼 j도 0부터 1000000000까지 1씩더하고
		;
		} // 여기서 끝냄
		System.out.println(i); // 10에서 1까지 뺀값들을 출력
		}
		System.out.println("GAME OVER");

	}

}
