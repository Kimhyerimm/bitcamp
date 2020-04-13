package ex;

public class FlowEx18 {

	public static void main(String[] args) {
		for(int i=1; i <=3; i++)
			//i는 1부터 3까지 1씩더함
			for(int j=1; j <=3; j++)
				//j는 1부터 3까지 1씩더함 i가 1번돌때 j는 3번씩
			for(int k=1; k <=3; k++)
				// k는 1부터 3까지 1씩더함 j가 1번돌때 k는 3번씩
			System.out.println(""+i+j+k);
// 111 112 113 121 122 123 순으로 마지막 k가 제일먼저실행되면서 하나씩올라감
	}

}
