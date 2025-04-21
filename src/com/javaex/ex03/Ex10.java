package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.print("과목 : ");
		
		int code = sc.nextInt();
		String cls;
		
		//switch 정수형, 문자, 문자열 가능
		switch(code) {
		case 1: 
			cls = "R101호";
			break;
			
		case 2: 
			cls = "R202호";
			break;
			
		case 3: 
			cls = "R303호";
			break;
			
		case 4: 
			cls = "R404호";
			break;
			
		default:
			cls = "상담원에게 문의하세요";
			break;
		}
		
		System.out.println(cls);
		
		sc.close();

	}

}
