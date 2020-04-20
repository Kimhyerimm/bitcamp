package ex;

import java.util.Arrays;

public class InstanceArray {

	public static void main(String[] args) {
		
		//참조형 변수를 저장하는 배열 생성
		
		String[] strArr=new String[3];
		
		strArr[0]=new String("Java");
		strArr[1]=new String("JS");
		strArr[2]=new String("Python");
		

		System.out.println("0번째 문자열길이 :"+strArr[0].length()); // 0번째 주소 길이
		System.out.println("0번째 toString :"+strArr[0].toString());
		
		//배열의 순차적 참조 : 반복문을 이용해서 순차 참조가능
		for(int i=0; i<strArr.length; i++) {
			
			System.out.println(strArr[i]);
			
		}
		System.out.println(Arrays.toString(strArr));
	}

}