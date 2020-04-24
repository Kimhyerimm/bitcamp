package car;

public class Car {

	String color;
	int door;
	
	
	void drive() {
		System.out.println("운전");
	}
	
	
	void stop() {
		System.out.println("정지");
	}
	
	
	public static void main(String[] args) {
		
		Car car = null;
		Fireengine fe1 = new Fireengine();
		Fireengine fe2 = null;
		Ambulance am = new Ambulance();
				
		fe1.water();
		car= fe1;
		// car.water(); 사용불가
		
		fe2 =(Fireengine)car;
		
		
//		
//		if(car instanceof Ambulance) {
//			am=(Ambulance)car; 
//			am.siren(); 
//		
//	}
	
	
}


class Fireengine extends Car{
	
	void water() {
		
		System.out.println("물 뿌리기"); 
	}
}

class Ambulance extends Car{
	
	void siren() {
		System.out.println("웨에에에에에엥");
		
	}
}
}

