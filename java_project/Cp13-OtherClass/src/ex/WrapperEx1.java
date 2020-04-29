package ex;

public class WrapperEx1 {

	public static void main(String[] args) {
	
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer("100");
		
		System.out.println("i1 == i2 : "+ (i1==i2));
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		//참조값 비교가아닌 벨류값 비교
		System.out.println("i1.toStinrg() : "+ i1.toString());
		System.out.println("i2.toStinrg() : "+ i2.toString());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
				
		
		
	}

}
