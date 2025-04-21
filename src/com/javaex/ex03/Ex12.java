package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		String day;
		    
//	    switch(month) {
//		case 1:
//			day="31일";
//			break;
//
//		case 2:
//			day="28일";
//			break;
//
//		case 3:
//			day="31일";
//			break;
//
//		case 4:
//			day="30일";
//			break;
//
//		case 5:
//			day="31일";
//			break;
//
//		case 6:
//			day="30일";
//			break;
//
//		case 7:
//			day="31일";
//			break;
//
//		case 8:
//			day="31일";
//			break;
//
//		case 9:
//			day="30일";
//			break;
//
//		case 10:
//			day="31일";
//			break;
//
//		case 11:
//			day="30일";
//			break;
//
//		default: 
//			day="31일";
//			break;
//			
//		}
//		
//		System.out.print(day+" 입니다");
//		
//		sc.close();
		
		
		switch(month) {

		case 2:
			day="28일";
			break;
		
		case 4:
		case 6: 
		case 9: 
		case 11: 
			day="30일";
			break;
		
		default: 
			day="31일";
			break;
			
		}
		
		System.out.print(day+" 입니다");
		
		sc.close();
	}

}
