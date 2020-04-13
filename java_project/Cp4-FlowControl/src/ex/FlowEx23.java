package ex;

public class FlowEx23 {

	public static void main(String[] args) {
		int sum =0;
		// 섬에 0저장
		int i = 0;
		// i에 0저장
		while(sum + i <= 100) {
			// 섬+i값이 100이하면 계속 아래돌림
		sum += ++i; // sum = sum + ++i;
		System.out.println(i + " - " + sum);
		}

	}

}
