package ex;

public class StringTest {

	public static void main(String[] args) {
		double dd = 1D; // double타입 변수 dd 에 1D 저장
		String a = 7 + " "; // String 문구타입 변수 a에 숫자7공백 저장
		String b = " " + 7; // b에 공백숫자7 저장
		String c = 7 + ""; // c에 7이랑 문구저장
		String d = "" + 7; // d에 쌍따움표문구 랑 7 저장
		String e = "" + ""; // e에 쌍따움표 안에 공백도없으므로 걍 아무것도없는거취급
		String f = 7 + 7 + ""; // f에 7+7 연산후에 쌍따움표 문구 저장
		String g = "" + 7 + 7; // g에 쌍따움표 문구가 먼저나왔으므로 뒤에도 문구로취급하게됨 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f); // 연산먼저하니까 14
		System.out.println(g); // 문구로취급하니까 77
		

	}

}
