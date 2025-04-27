package com.javaex.practice;


import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
			
			
			
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		//wonArray 를 따라가면 int[]가 나옴 이걸 = 여기에 int[10]칸에 담아  
		int[] wonArray = new int[10];
		
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		
		//시작은 0번방터부터;wonArray의 방수만큼 돈다; 돌때마다 1씩 증가
		for(int i=0; i<wonArray.length; i++) {
			int count = price/wonArray[i];	// 입력값/단위 나눴을 때 단위가 몇개나오는지?
			if(count > 0) { //입력값에서 나눈 게 0보다 크면 출력해
				System.out.println(wonArray[i] + "원:" + count + "개");
				price = price%wonArray[i];
		    	
		    	
		    }	
		}
		
		sc.close();
	}

}
