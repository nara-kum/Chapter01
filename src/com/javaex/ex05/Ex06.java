package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		double[] doubleArr = new double[3];
		
		doubleArr[0] = 3.4;
		doubleArr[1] = 6.2;
		doubleArr[2] = 9.5;//int 형으로 넣으면 자동 형변환 해서 넣음
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("-------------------");
		
		char[] charArr = new char[3];
		
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c';
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		System.out.println("-------------------");
		
		String[] stringArr = new String[3];
		
		stringArr[0] = "나라";
		stringArr[1] = "수진";
		stringArr[2] = "영일";
		
		for(int i=0; i<stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		
		System.out.println(stringArr[2]);
		
	}

}
