package ex;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv1=new Tv();
		
		IpTv itv = (IpTv) tv1;
		//자식 변수 = (자식) 조상 -> 불가
		
		
		// Tv tv2=new CaptionTv();
	//	CaptionTv test = tv2; // 얘도 결국 앞에가 자식이고 tv2는 조상이니 불가 
		
		CaptionTv cTv1= new CaptionTv();
		
		Tv t = (Tv)cTv1; // t에 CaptionTv가 들어가는게아니라 Tv로 바뀌는거임 (Tv)는생략가능.
		//조상 변수 = (조상)자식 -> 가능
		
		
		
		
		Tv tv2=new CaptionTv();
	
		CaptionTv ctv2 = (CaptionTv)tv2;
		ctv2.caption();
		System.out.println("--------------");
		((CaptionTv) tv2).caption();
	
		
		
		
//		System.out.println(tv2.power);
		tv2.power();
//		System.out.println(tv2.power);
		
		tv2.display();
		
		
		
		Tv tv3=new IpTv();
//		tv3.display();
		
		Tv tv4=new SmartTv();
//		tv4.display();
		
		Tv[] tvs = new Tv[4];
		
		tvs[0] = new Tv();
		tvs[1]=new CaptionTv();
		tvs[2]=new IpTv();
		tvs[3]=new SmartTv();

		
		for(int i=0; i<tvs.length; i++)
		tvs[i].display();
	}

}
