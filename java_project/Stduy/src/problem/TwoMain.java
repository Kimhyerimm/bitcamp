package problem;

public class TwoMain {

	public static void main(String[] args) {
		
		Two man = new Two("man",15);
		Two girl = new Two("girl",9);
		
		man.game(girl, 2);
		
		System.out.println(man.ball);
		System.out.println(girl.ball);
		
		System.out.println("2차전");
		
		girl.game(man, 7);
		System.out.println(man.ball);
		System.out.println(girl.ball);
		

	}

}
