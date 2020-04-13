package ex;

public class FlowEx15 {

	public static void main(String[] args) {
		int sum =0; // 섬에 0저장
		for(int i=0; i <=10; i+=2) { // i는0부터 10까지 i=2씩 더해짐
		sum += i; // sum = sum + i;
		System.out.println(i + " : " + sum);
		}
	}

}
