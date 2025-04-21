package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 입력하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호 : ");
		
		int code = sc.nextInt();
		String cls;
		
		if(code==1) {
			cls="R101호";
		}else if(code==2) {
			cls="R202";
		}else if(code==3) {
			cls="R303호";
		}else if(code==4) {
			cls="R404호";
		}else {
			cls="상담원에게 문의하세요";
		}
		
		System.out.println(cls);
			
		sc.close();
	}

}
