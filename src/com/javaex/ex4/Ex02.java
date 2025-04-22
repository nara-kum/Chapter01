package com.javaex.ex4;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		int i=0;
		int index=1;
		int result;
		
		while(i<9) {
			
			result = dan*index;
			
			System.out.println(dan+" * "+index+" = "+result);
			
			index++;
			i++;
		}
		
		sc.close();
		
	}

}
