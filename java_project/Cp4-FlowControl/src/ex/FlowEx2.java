package ex;

public class FlowEx2 {

	public static void main(String[] args) {
		int visitCount = 5;//int타입 변수 비짓카운터에 5저장
		if ( visitCount <1 ) { // 만약 비짓카운터가 1보다작으면 아래출력
			System.out.println("처음오셨군요 방가");
		}
		else { // 위에조건이아니라면 즉 1보다 크면 아래출력
			System.out.println("다시방문해주셔서 감사");
		}
		
		
		System.out.println("방문횟수는"+ ++visitCount +"번");
	}

}
