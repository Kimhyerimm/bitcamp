package ex;

public class FlowEx19 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//currentTimeMillis 메서드는 UTC 시간 즉, 1970년 1월 1일 자정부터 현재까지 카운트된 시간을 ms(milliseconds) 단위로 표시합니다.
		// 1/1000한다고함 그걸 스타트타임에저장
		System.out.println(startTime); // 1586773264007 이니까 Long타입붙여줘야함
		for(int i=0; i < 1000000000; i++) { // i는0부터 9999999999까지 1씩더함
		
		}
		long endTime = System.currentTimeMillis();
		// 위에 스타트타임이랑 똑같고 반복문에서 뭐가어케됐길레 end타임값이랑 스타트 다른지모르겠음
		System.out.println("시작시간 : " + startTime);
		System.out.println("종료시간 : " + endTime);
		System.out.println("소요시간 : " + (endTime - startTime));
	
	}

}
