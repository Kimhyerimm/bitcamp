package ex;

public class FlowEx13 {

	public static void main(String[] args) {
		int sum =0; // 섬에 0저장
		for(int i=1; i <= 10; i+=2) { // i는 1부터 10까지 1씩더하면서 반복
		sum += i ; // 섬=섬+i 값을 위에 10번저장함
		}
		// System.out.println(i-1 + " 까지의 합: " + sum); //에러뜸
		// i값을 포문안에서 선언하고 포문끝냈기때문에 여기서 못대려옴

	}

}
