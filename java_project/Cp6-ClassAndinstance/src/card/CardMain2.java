package card;

public class CardMain2 {

	public static void main(String[] args) {
		
		
		Card abc = new Card();
		Card abc2 = new Card();
		
		
			
			for(int i=0; i<4; i++) {
				for(int j=1; j<14; j++) {
				
					
					String kind= "";
					
					switch(i) {
					case 0:
					kind = "Spade";
					break;
				
					case 1:
					kind = "Clover";
					break;
					
					case 2:
					kind = "Heart";
					break;
					
					case 3:
					kind = "Diamond";
					break;
					
					
					}
					
					Card cd = new Card();
					cd.kind = kind;
					
					System.out.println(cd.kind +j);
				
			
		}
			
			}

	}

}
