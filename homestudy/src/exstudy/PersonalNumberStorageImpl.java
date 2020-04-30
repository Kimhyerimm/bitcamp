package exstudy;

public class PersonalNumberStorageImpl extends PersonalNumberStorage {
	
	PersonalNumInfo[] perArr; // PersonalNumInfo 를 배열타입으로 만듬
	int numOfPerInfo; // 배열이 있으면 정수타입도 한개 만들자
	
	
	public PersonalNumberStorageImpl(int sz){  // 생성자 초기화 매개변수에 직접 입력받음 
		perArr = new PersonalNumInfo[sz]; // 배열타입사이즈를 매개변수로 직접입력받음
		numOfPerInfo=0; // 배열개수 초기화

	}
	
	
	
	@Override
	public void addPersonalInfo(String perNum, String name) { // 오버라이드 초기화
		// 저장시킬메소드니까 배열을 저장시키자
		perArr[numOfPerInfo]=new PersonalNumInfo(name, perNum); 
		numOfPerInfo++; // 위에 새로운인스턴스가 저장될때마다 1개씩 배열증가
		
	}

	@Override
	//네임을통해 주소값을찾자
	public String searchName(String perNum) {
		
		for(int i=0; i<numOfPerInfo; i++) {
			if(perArr[i].getNumber().equals(perNum)) {
				return perArr[i].getName();
			}
		}
		
		return null;
	}
	
	
	
	
	
	

}
