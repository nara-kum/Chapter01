package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
//		일반적
		double pi = 3.14;
		
		double result01 = pi*5*5;
		System.out.println(result01);
		
//		pi값 변경가능
		pi = 3.141512;
		double result02 = pi*5*5;
		System.out.println(result02);
		
//		상수로 정의하는 방식
		final double PI = 3.14;      //final 상수로 정의할때는 대문자로 표기함
		
		double result03 = PI*5*5;
		System.out.println(result03);
		
//		상수값 변경시도시 에러발생
//		PI = 3.141512;
//		double result04 = PI*5*5;
//		System.out.println(result04);
		
	}

}
