package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==6 && i%3==0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("====================");
		
			for(int i=1; i<=10; i++) {
				
				System.out.println(i);
			}
			
	}

}
