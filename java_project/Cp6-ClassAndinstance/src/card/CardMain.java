package card;

public class CardMain {

	public static void main(String[] args) {
		
		
//		Card c1 = new Card();
//		
//		c1.kind="Heart";
//		c1.number=7;
		
		Card c1 = new Card("Heart",7);
		
		Card c2 = new Card(); // 3번
		c2.kind="Triangle"; // 이부분이랑 아래를 지우고 위 파라미터에 값을넣어야함
		c2.number=5;
		
		System.out.println("첫번째 카드의 모양은"+c1.kind+"이며 번호는"+c1.number+"이며 높이는"+c1.height+"길이는"+c1.width);
		System.out.println("두번째 카드의 모양은"+c2.kind+"이며 번호는"+c2.number+"이며 높이는"+c2.height+"길이는"+c2.width);
		
		System.out.println("카드의 사이즈를 변경합니다");
		Card.height = 125;
		Card.width = 50;
		

		System.out.println("첫번째 카드의 모양은"+c1.kind+"이며 번호는"+c1.number+"이며 높이는"+c1.height+"길이는"+c1.width);
		System.out.println("두번째 카드의 모양은"+c2.kind+"이며 번호는"+c2.number+"이며 높이는"+c2.height+"길이는"+c2.width);
		


		
		
	}

}
