package op;

public class OperatorEx3 {
	public static void main(String args[]) {
	int i=5,j=5; // int타입 변수 i와 j에 각 5씩 저장
	System.out.print(i++); // i값을 후위형증가시킴 아직i는 5
	System.out.print(++j); // j값을 전위형증가시킴 여기서 이미 j는 6
	System.out.print("i="  +i  +  ",j="  +j); // i는 6출력 j도 6출력
}
}
