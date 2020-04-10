package op;

public class OperatorEx1 {

	public static void main(String[] args) {
		int i=5; // int타입 변수 i에 5 저장
		i++; // i가 후위형으로 1 더해짐 지금은 i=5 
		System.out.println(i); // i가 1더해져 5+1 = 6출력
		
		i=5;
		++i; // 전위형으로 여기서 이미 1더해짐 i=6
		System.out.println(i); //6출력

	}

}
