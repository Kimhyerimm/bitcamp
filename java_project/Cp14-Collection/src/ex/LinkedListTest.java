package ex;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();

		// List<E> 정의된 메소드 --> 
		// add(E) : 인스턴스의 저장 
		// remove(index) : 해당 index의 요소를 삭제 
		// size() : List 요소의 개수를 반환
		// get(index) : 해당 index위치의 요소 반환
		
		
		// 데이터의 저장 : 저장의 순서를 가지고 있다 
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));
	
		System.out.println(list);
		
		// 데이터의 참조 
		System.out.println("저장된 데이터를 확인합니다.");
		// 반복문을 통해서 일괄 참조 가능
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			// 저장된값 10,20,30,40 순서대로출력함
		}
		
		System.out.println("-----remove----------");
		// 데이터의 삭제
		list.remove(1);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		
		} // for 끝
		
		
		System.out.println("Iterator 이용한 모든 요소 출력");
		System.out.println("---------------");
		Iterator<Integer> itr = list.iterator();	
		
		while ( itr.hasNext() ) { // 커서 시작
			int num = itr.next(); // num = 10
			System.out.println(num);
		}
		
		
		
	} // main 끝 

}
