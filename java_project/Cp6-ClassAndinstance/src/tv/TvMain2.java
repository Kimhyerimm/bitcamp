package tv;

public class TvMain2 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1==t2);
		
		System.out.println("--------------------");
		System.out.println("tv1의 channel :" + t1.channel);
		System.out.println("tv2의 channel :" + t2.channel);
		
		System.out.println("---------------------");
		
		t1.channel=11;
		System.out.println("tv1의 channe을 11로 변경");
		System.out.println("tv1의 channel :" + t1.channel);
		System.out.println("tv2의 channel :" + t2.channel);
		
		
		
		
		
	}

}
