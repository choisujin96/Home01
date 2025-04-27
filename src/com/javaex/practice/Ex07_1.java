package com.javaex.practice;

public class Ex07_1 {
	public static void main(String[] args) {
		
		//지피티가 내준 예제
		//문제: 1200원 물건을 구입 2700 지불. 거스름돈은 얼마 받아야 하나요?
		//단위로 나타나셈(for문사용)
		
		int[] money = new int[3];
		
		money[0] = 1000;
		money[1] = 500;
		money[2] = 100;
		
		int sum = 2700-1200; //sum=지불한값-물건값
		//꼭 for문 밖으로 빼야함!!!! 안에 들어가면 계속 돌기 때문에 각각합해 나옴.
		
			//0번방부터 시작, 머니길이만큼 돌꺼고 돌때마다 1씩 증가	
		for(int i=0; i<money.length; i++) {
			int count=sum/money[i]; //sum과 단위를 나눴을때 단위가 몇개나오는지요?
			if(count>0) { //단위가 0 초과면 출력!
				System.out.println(money[i] + "원" + count + "개");
				sum = sum % money[i]; //나머지 금액 갱신
			
			}
			
		}
			
	}

}
