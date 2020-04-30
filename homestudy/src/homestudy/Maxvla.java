package homestudy;

public class Maxvla {


	
	public static int maxmethod (int array[i]) {
		int max = array[0];
	
		for(int i=0; i<array.length; i++) {
		
			if(max<array[i]) { // 0번째값이 똑같이 10번반복하면서 i가 더크면 max를 i값으로바까줌
				max=array[i];
	}	
	}
		return max;
	}	
	}//메인클래스끝

	
}
