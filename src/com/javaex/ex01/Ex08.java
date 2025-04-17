package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		//대입연산자 =
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("----------------------------------");
		
		//산술연산자
		int sum = a + b;
		System.out.println(sum);   //+
		
		System.out.println(a+b);   //  +
		System.out.println(a-b);   //  -
		System.out.println(a*b);   //  *
		System.out.println(a/b);   //  /  몫
		System.out.println(a%b);   //  %  나머지
		
		System.out.println(7/2);
		System.out.println(7.0/2);
		System.out.println(7.0/2.0);
		
		System.out.println("----------------------------------");
		
		//부호연산자
		int var  = -3;
		int pVar = -var;
		System.out.println(pVar);
		
		int mVar = +var;
		System.out.println(mVar);
		
		System.out.println("----------------------------------");
		
		//증감연산자
		//해야할 일을 나열함, 증감을 먼저할 지 나중할 지 결정함 
		System.out.println(a);
		System.out.println(++a);   // ++가장먼저하고 출력
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
		System.out.println("----------------------------------");
		
		System.out.println(a);      // 8
		System.out.println(a++);    // 8   +1, 출력  //출력하고 가장나중++
		System.out.println(a);      // 9

		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);

		System.out.println("----------------------------------");
		
		int c = 5;
		System.out.println(++c*2); //12
		System.out.println(c);     //6
		
		int d = 5;
		
		System.out.println(d);
		System.out.println(d++ * 2);   // 10
		System.out.println(d);         // 6
		
		
		
	}

}
