package com.javaex.practice;

import java.util.Objects;

public class Person {
	//<수진연습>
	
	
	//필드
	private String name;
	private int age;
	
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	//메소드gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	//메소드일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
