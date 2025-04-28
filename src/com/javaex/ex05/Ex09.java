package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		int[] arrB = arrA;
		
		arrB[2] = 999;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("----------------------");

		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		System.out.println("----------------------");

		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
	}

}
