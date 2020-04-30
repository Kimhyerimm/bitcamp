package homestudy;

import java.util.Scanner;

public class Arraystudy {

	public static int main(String[] args) {
	
		
		int array[] = new int[10]; // 10개 저장공간 저장
		
		
	
		
		Scanner kb = new Scanner(System.in); // 최대최소받을 kb
		
		System.out.println("최대값 최소값을 구할 숫자 10개를 입력"); 
		
		for(int i=0; i<array.length; i++) { // 10번 반복함
			array[i] = kb.nextInt(); // 10번동안 숫자입력
			
		}
		
		System.out.println(minmethod(array)); // 최소값 메소드출력 
		System.out.println(maxmethod(array)); // 최대 메소드출력 

	
	
		
		
		 static int minmethod (int[] array) { // 최소
			int min = array[0]; // 기준값 0번째 값으로 잡아둠
		
			for(int i=0; i<array.length; i++) { // 10번돌림
				if(min>array[i]) { // 0번째값이 i값 0,1,2,~10 까지 반복하면서 0번째값이 더크면 ?? 
					min=array[i];
				}
			}
			return min; // 위에 min=array[i]리턴시킴
		}
		
		static int maxmethod (int[] array) {
			int max = array[0];
		
			for(int i=0; i<array.length; i++) {
			
				if(max<array[i]) { // 0번째값이 똑같이 10번반복하면서 i가 더크면 max를 i값으로바까줌
					max=array[i];
		}	
		}
			return max;
		}	
		}//메인클래스끝


