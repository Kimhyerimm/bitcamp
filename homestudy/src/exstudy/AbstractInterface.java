package exstudy;

public class AbstractInterface {

	public static void main(String[] args) {
		
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		
		storage.addPersonalInfo("111", "가");
		storage.addPersonalInfo("222", "나");
		
		System.out.println(storage.searchName("111"));
		System.out.println(storage.searchName("222"));
		

	}

}

