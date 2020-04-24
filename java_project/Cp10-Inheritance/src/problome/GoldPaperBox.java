package problome;

public class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("gold wrap");
		}

	@Override
	public void wrap() {
		goldWrap();
	}
	



	
	
}
