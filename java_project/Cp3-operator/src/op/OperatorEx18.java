package op;

public class OperatorEx18 {

	public static void main(String[] args) {
		
		float pi=3.141592f; // float타입 pi에 3.141592f저장
		float shortPi=Math.round(pi*1000)/ 1000f; 
		//math.round는 소수점 첫째자리에서 반올림 후 int로바꿈
		// pi*1000 먼저하면 3141.592f -> math.rond하면 3142 -> / 1000f 하면 -> 3.142[ int가 float 보다 더 크니까 ]
		
		
		System.out.println(shortPi);

	}

}
