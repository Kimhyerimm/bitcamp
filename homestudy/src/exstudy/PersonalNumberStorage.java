package exstudy;

abstract class PersonalNumberStorage { 

	// 오버로딩할 메소드들
	public abstract void addPersonalInfo(String perNum, String name); // 저장시킬메소드
	public abstract String searchName(String perNum); //검색할 메소드 
	
	
}
