package scm;

public class scmMain {

	public static void main(String[] args) {
		
		//상속관계에서 다형성
		// 상위클래스 타입의 참조변수 = 하위클래스의 인스턴스
		Product p = new Tv(100);
//		System.out.println(p1);
		
		
		
		Tv tv =new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);
		
		
	
 	// 아래처럼 쓰는이유는 생성자개념에서 동일한매개변수[타입]에 다른건안넣고 상위클래스에
		// 포함되는것만 넣어야할때 저런식으로하면됨 처음에 폰프로젝트 했던 이름, 번호만넣는경우로생각 
		//아래 자동형변환
		Product p1 = tv; // Product p1 = (Product)tv; 인데 () 명시적변환이 빠져도 알아서 자동으로됨  
		Product p2 = com; // Prodcut p2 = new Computer(20)와 같은데 무슨차이? 위에 똑같음 Computer에서 Prdocut에있는 주소값만 쓰려면
		Product p3 = aud;
		
		int sum= tv.price+com.price+aud.price ; // 10 + 20 + 30
		System.out.println(sum);
		
		System.out.println("------------배열시작----------");
		//---------------------//
		// 배열로 만드는법
		
		
		// 상위 클래스 타입의 배열 생성 
		// products[0]= new Tv(100) 이랑 위에 Product p1 = tv 랑 같다고함 
		Product [] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(200);
		products[2] = new Audio(300);
		
		// products[0].display(); 불가능함 0번지에는 Tv의 주소값이 있지만 products[0]은 Product의 객체이므로 주소값만가지고있고 못씀
		// 상위타입의 변수-> 하위타입의 변수 로 명시적 형변환 해줘야함
		// instanceof 연산자 -> p1 instanceof Computer ==> true/false 트루나올거임
		//참조변수가 참조하는 인스턴스를 뒤쪽에오는 클래스 타입으로 형변환 가능한지 여부를 확인
		
		
		// 전달 하는 배열에 컴퓨터가 있다면 프로그래밍 하겠다.
		for (int i=0; i<products.length; i++) {
			
			if(products[i] instanceof Computer) {
				((Computer)products[i]).programming(); // if문 instanceof없으면 오류뜸 
				}
			
		}
		
		System.out.println("===============");
		System.out.println("===============");
		
		int sumOfPrice = 0;
		int sumOfPoint = 0;
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i]);
			sumOfPrice=sumOfPrice+products[i].price;
			sumOfPoint += products[i].bonusPoint;
		}
//		System.out.println("전체 제품 가격의 합은 : "+sumOfPrice);
//		System.out.println("전체 제품 포인트의 합은 : "+sumOfPoint);
//		System.out.println("------------Buyer시작---------");
		
		// ------------------------------- // 
		// 아래서부터는 Buyer 코드  
	
		// 구매자가 제품을 구매하는 시뮬레이션
		// 구매자 생성
		Buyer buyer = new Buyer();
		
		//제품 생성
		Tv product1 = new Tv(300);
		Computer product2 = new Computer(500);
		Audio product3 = new Audio(300);
		
		//Tv 구매
		buyer.buy(product1); // 1000-300 700
		//Computer 구매
		buyer.buy(product2); // 700 - 500 200
		//Audio 구매
		buyer.buy(product3);  // 200 - 300 불가
		
//		System.out.println("현재 보유금액 : "+buyer.money);
//		System.out.println("현재 보유포인트 : "+buyer.bonusPoint);
//		
		
	System.out.println("--------영수증시작-----------");
		
		buyer.summary();
		
		
		
		
	}

}
