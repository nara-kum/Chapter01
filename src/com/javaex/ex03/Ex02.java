package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] arge) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int point = sc.nextInt();
		
		if(point>=60) {
			//true일 때
			System.out.println("합격입니다!");
			
		}else {
			//true가 아닐 때
			System.out.println("불합격입니다.");
		}
		
		System.out.println("종료");
		
		sc.close();
	}

}
