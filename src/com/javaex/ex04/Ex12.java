package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		int sum = 0; //숫자를 누적한 값
//		int num;
//		
//		do{
////			숫자입력
//			num = sc.nextInt();
//			
////			합계
//			sum = sum + num;
//			
////			합계출력
//			System.out.println("합계 : " + sum);
//			
//		}while(num!=0);
//		
//		
//		
//		System.out.println("종료");
//			
//		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");

		int sum=0;
		
		while(true) {
			
			int num = sc.nextInt();
			sum = sum + num;
			
			System.out.println("합계 : " + sum);
			
//			0이면 끝
			if(num==0) {
				break;
			}
			
		}
		
		System.out.println("종료");
		
			
		sc.close();
	}
}








