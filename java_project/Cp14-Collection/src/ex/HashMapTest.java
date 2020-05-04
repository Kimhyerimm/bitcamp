package ex;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// 입력
		map.put(1, "일번");
		map.put(2, "이번");
		map.put(3, "삼번");
		
		// 참조
		System.out.println("1번 학생의 이름은 : "+ map.get(1));
		System.out.println("2번 학생의 이름은 : "+ map.get(2));
		
		// 삭제
		map.remove(3);
		System.out.println("3번 학생의 이름은 : "+ map.get(3));
		
		// key 값은 중복 혀용이 되지 않는다.
		System.out.println("----------------");
		System.out.println(map.get(2));
		map.put(2,"Two");
		System.out.println(map.get(2));
		
		

	}

}
