package homestudy;

public class Minvla {

	
	public static int minmethod (int array[i]) { // 최소
		int min = array[0]; // 기준값 0번째 값으로 잡아둠
	
		for(int i=0; i<array.length; i++) { // 10번돌림
			if(min>array[i]) { // 0번째값이 i값 0,1,2,~10 까지 반복하면서 0번째값이 더크면 ?? 
				min=array[i];
			}
		}
		return min; // 위에 min=array[i]리턴시킴
	}
	
}
