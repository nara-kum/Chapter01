package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//키보드 연결(입력값 받기)
		Scanner sc = new Scanner(System.in);    //lib(미리만들어둔 기능)에서 import 해와야 함
		
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();      //입력대기
		System.out.println("입력한 값은 "+num+" 입니다.");
		
		//키보드 해제
		sc.close();
		
	}

}
