package com.javaex.ex4;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int n=2; n<=9; n++) {
			
			for(int i=1; i<=9; i++) {
				
				int result = n*i;
				System.out.println(n+" * "+i+" = "+result);
			}
			
			System.out.println("=====================");
		}

	}

}
