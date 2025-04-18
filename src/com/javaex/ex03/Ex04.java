package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		int sal;
		
//		범위 안쪽에서 생성된 변수를 범위가 끝나면 사라진다.
//		 맞게 변수 선언한다.
		
		if(time<=8) {
			
			sal = time*10000;
			
		}else if (time>8) {
			
			sal = (8*10000) +(time-8)*12000;
			
		}else {
			
			sal = 0;
			
		}
		
		System.out.println("임금은 " + sal + " 원 입니다.");
		
		sc.close();

	}

}
