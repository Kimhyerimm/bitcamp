package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{

	
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name=name;
		this.age=age;
		
	}
	
	
	void showData() {
		
		System.out.println("이름 :"+ this.name + "나이 : "+this.age);
	}


	@Override
	public int compareTo(Person arg0) {
		
		int result = 0;

		result = this.age-arg0.age; // 오름차순
//		result = (this.age-arg0.age)* -1 ; // 내림차순  
		
		return result;
	}
	
	public static void main(String[] args) {
		
		TreeSet<Person> tree = new TreeSet<Person>();
		tree.add(new Person("Son", 27));
		tree.add(new Person("King", 30));
		tree.add(new Person("Lee", 20));
		
		
		Iterator<Person> itr = tree.iterator();
		
		while(itr.hasNext()) {
			itr.next().showData();
			
		}
	}
	

}
