package ex;

public class AbstractInterfaceMain {

	public static void main(String[] args) {
		
	// 추상클래스	PersonalNumberStrorage storage = new PersnalNumberStorageImpl(100);
		//인터페이스클래스시작
		PersnalNumber storage = new PersnalNumberStorageImpl(100);
		
		
		storage.addPersnalInfo("202020-11111111", "뉴캐슬");
		storage.addPersnalInfo("303030-2222222", "박지성");
		
		System.out.println(storage.searchName("202020-11111111"));
		System.out.println(storage.searchName("303030-2222222"));
		

	}

}
