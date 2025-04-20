package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		String grade;
		
		if(score>=90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B"; 
		}else if(score>=70) {
			grade = "C";
		}else if(score>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.print(grade+"등급");
		
		sc.close();

	}

}
