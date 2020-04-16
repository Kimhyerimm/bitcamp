package ex;

public class AccessWayMain {

	public static void main(String[] args) {
		System.out.println(AccessWay.num);
		AccessWay.num++;
		System.out.println(AccessWay.num);
		
		AccessWay acc = new AccessWay();
		System.out.println(acc.num2);

	}

}
