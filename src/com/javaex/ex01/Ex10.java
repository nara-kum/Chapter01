package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		System.out.println("&& 연산자 AND --------------------");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("|| 연산자 OR --------------------");

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("! 연산자 not --------------------");
		
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("응용 ---------------------------");
		
		boolean result = (a<b) && (a>b);    //5<7(true) && 5>7(false)  ==> false
		System.out.println(result);
		
		System.out.println(true && false || true);
		System.out.println(true || false || true);
		
		System.out.println(!(a>b));
		
		
	}

}
