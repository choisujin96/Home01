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
		
		for(int i=1; i<=price; i++) {
				
		}
		/*
		System.out.print("50000원: "  );
		System.out.print("10000원: "  );
		System.out.print("5000원: "  );
		System.out.print("1000원: " );
		System.out.print("500원: "  );
		System.out.print("100원: "  );
		System.out.print("50원: "  );
		System.out.print("10원: "  );
		System.out.print("5원: " );
		System.out.print("1원: ");
		*/
		//ㅠㅠㅠ다시하
		
		sc.close();
	}

}
