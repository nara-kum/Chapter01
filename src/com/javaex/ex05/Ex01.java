package com.javaex.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받은 숫자까지의 정수중(양수만)");
		System.out.println("임의의 6개의 숫자를 출력하세요");
		System.out.print("입력 : ");
		int num;
		int ran = sc.nextInt();

		for(int i=1; i<=6; i++) {
			num = (int)(Math.random()*ran)+1;
			System.out.print(num+"\t");
		}
		

		sc.close();
	}

}
