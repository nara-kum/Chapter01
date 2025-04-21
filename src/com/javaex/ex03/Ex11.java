package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.print("과목 : ");
		
		String code = sc.nextLine();
		String cls;
		
		switch(code) {//a b c d f 
		case "A": // code==A
			cls = "R101호";
			break;
			
		case "B": 
			cls = "R202호";
			break;
			
		case "C": 
			cls = "R303호";
			break;
			
		case "D": 
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
