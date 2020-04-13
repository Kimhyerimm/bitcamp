package ex;

public class FlowEx27 {

	public static void main(String[] args) {
		Loop1 : for(int i=2;i <=9;i++) {
			//Loop1 이름붙인 포문 i=2부터 9이하일때까지 1씩더함
			for(int j=1;j <=9;j++) {
				//j는 1부터 9이하일때까지 1씩더함
			if(j==5)
				//j 돌리다가 j가 5나오면 
			break Loop1; // 걍 위에 메인포문 종료시켜버림
	
			System.out.println(i+"*"+ j +"="+ i*j);
			} 
			System.out.println();
			} 

	}

}
