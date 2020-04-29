package ex;

public class AutoBoxinUnBoxing {

	public static void main(String[] args) {

		Integer iValue = 10; // new Integer(10)
		Double dVlaue = 3.14; // new Double(3.14)
		
		System.out.println(iValue.toString());
		System.out.println(dVlaue.toString());
		
		int num1=iValue; // Auto unboxing
		double num2=dVlaue;
				
		System.out.println(num1);
		System.out.println(dVlaue);
		
		
		
	}

}
