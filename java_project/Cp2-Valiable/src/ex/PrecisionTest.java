package ex;

public class PrecisionTest {

	public static void main(String[] args) {
		float f = 1.2345678901234567890f; // float타입 변수f에 1.234~~f 저장, 저장된값이12억보다 커서 float 범위를넘어가 f를 붙여야함
		double d = 1.2345678901234567890; // double타입 변수d에 1.234~ 저장, 저장된값이 double 타입 크기에 담을수있어서 따로 d안써도됨
		float f2 = 0.100000001f; // float타입 변수f2에 0.100~ 저장, 저장된값이 float 크기를 넘어서 f 붙여야함
		double d2 = 0.100000001;  // double타입 변수d2에 0.10~~ 저장 
		double d3 = 0.1000000000000001; // double타입 변수d3에 0.100~ 저장
		System.out.println(f); // 1.2345678 8자리까지 출력 9자리숫자는 반올림함 
		System.out.println(d); // 1.2345678901234567 17자리까지출력 
		System.out.println(f2); //  0.1000000 8자리까지출력인데 0이니까 사라짐
		System.out.println(d2); // 0.100000001 17자리 내로 포함되므로 그냥 다 출력됨
		System.out.println(d3); // 0.1000000000000001 딱 17자리므로 다 출력됨
	}

}
