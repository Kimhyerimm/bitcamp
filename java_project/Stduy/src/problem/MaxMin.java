package problem;

public class MaxMin {

	
	public static int miniValue(int[] arr) {
		int min=arr[0]; // arr 0 이라는 기준값을잡음
		for (int i=0; i<arr.length; i++) {
			if ( arr[i]<min) {
				min=arr[i];
			} 
			return min;
		}
		
		
		
		
		return min;
	}
	
}
