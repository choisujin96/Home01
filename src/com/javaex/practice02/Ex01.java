package com.javaex.practice02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		//리스트 만들기
		List<PhoneBook> pList = new ArrayList<PhoneBook>();
		
		//스트림 만들기
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if( str==null ) {
				break;
			}
			String[] sArray = str.split(",");
			
			System.out.println(sArray[0]);
			System.out.println(sArray[1]);
			System.out.println(sArray[2]);
			System.out.println("********************");
			
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
			
			PhoneBook p = new PhoneBook(name, hp, company);
			
			pList.add(p);
			
		}
		
		/*
		System.out.println("---테스트전체값 출력-------------");
		System.out.println(pList.toString());
		*/
		
		PhoneBook p00 = pList.get(0);
		PhoneBook p01 = pList.get(1);
		PhoneBook p02 = pList.get(2);
		
		PhoneBook p04 = new PhoneBook("최수진","010-8888-5454","031-989-8989");
		pList.add(p04);
		
		
		PhoneBook p05 = new PhoneBook("유재석","010-7777-1212","02-323-3244");
		pList.add(p05);
			
		
		for(PhoneBook p : pList) {
			System.out.println("이름:" + p.getName());
			System.out.println("핸드폰:" + p.getHp());
			System.out.println("회사:" + p.getCompany());
			System.out.println("------------------------------");
			
			
			
			
		}
	
	}


}
