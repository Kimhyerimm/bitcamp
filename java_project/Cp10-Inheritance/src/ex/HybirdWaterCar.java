package ex;

public class HybirdWaterCar extends HybridCar {
	int waterGauge;
	
	
	HybirdWaterCar(int gasolinegauge, int electronicGauge,int waterGauge) {
		super(gasolinegauge, electronicGauge);
		this.waterGauge=waterGauge;
		
	}

	
	
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 가솔린 : " + electronicGauge);
		System.out.println("잔여 가솔린 : " + waterGauge);
	
		

	}

}
