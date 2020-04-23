package ex;

public class CarMain extends HybirdWaterCar {

	CarMain(int gasolinegauge, int electronicGauge, int waterGauge) {
		super(gasolinegauge, electronicGauge, waterGauge);
	
	}

	public static void main(String[] args) {
		
		HybirdWaterCar ab = new HybirdWaterCar(30, 40, 50);
		ab.showCurrentGauge();
		

	}

}
