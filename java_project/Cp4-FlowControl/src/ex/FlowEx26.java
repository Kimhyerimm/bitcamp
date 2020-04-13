package ex;

public class FlowEx26 {

	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			//i는 0부터 10이하일때까지 1씩 계속 더해짐
			if (i%3==0)
				// 만약 i값이 3으로나눴을때 나머지가0이면
			continue; // 다시 반복문돌리면서 1씩더해짐
			System.out.println(i); // 3배수 빼고출력
			}

	}

}
