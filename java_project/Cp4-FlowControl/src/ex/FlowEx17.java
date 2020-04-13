package ex;

public class FlowEx17 {

	public static void main(String[] args) {
		for(int i=2; i <=9; i++)
			//i는 2부터 9까지 1씩더함
			for(int j=1; j <=9; j++)
				// j는 1부터 9까지 1씩더하는데 i가 1번실행될때마다 j는9까지계속돌림
			System.out.println( i +" * "+ j + " = " + i*j );

	}

}
