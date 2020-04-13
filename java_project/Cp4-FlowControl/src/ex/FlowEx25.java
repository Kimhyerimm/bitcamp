package ex;

public class FlowEx25 {

	public static void main(String[] args) {
		int sum =0;
		// 섬에 0저장
		int i = 1;
		// i에 1저장
		while(true) { // 아래 계속반복함
		if(sum > 100) // 섬이 101되면 와일탈출함
		break;
		sum += i; // 섬= 섬+i
		i++; // i는 1씩 계속증가함 
		} // 스위치끝
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

	}

}
