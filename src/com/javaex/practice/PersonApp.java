package com.javaex.practice;

import java.util.HashSet;
import java.util.Set;

public class PersonApp {

	public static void main(String[] args) {

		//<수진 중복제거 hashcode() 연습>
		
		
		Set<Person> pSet= new HashSet<Person>();		
		
		Person p01 = new Person("최수진", 30);
		Person p02 = new Person("이청아", 38);
		Person p03 = new Person("최수진", 30);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet);
		
		System.out.println("------------------");
		
		for(Person p : pSet) {
			System.out.println(pSet.hashCode());
			System.out.println(pSet.toString());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
