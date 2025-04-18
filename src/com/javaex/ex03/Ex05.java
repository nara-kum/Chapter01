package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		int sal;
		
		if(time<=8) {
			
			sal = time*10000;
			
		}else if (time>8) {

			sal = (8*10000) +(time-8)*(10000+(10000/2));
			
		}else {
			
			sal = 0;
			
		}
		
		System.out.println("임금은 " + sal + " 원 입니다.");
		
		sc.close();

	}

}
