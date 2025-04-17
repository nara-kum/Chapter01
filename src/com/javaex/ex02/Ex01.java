package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//개행하고 출력
		System.out.println("안녕");
		System.out.println("하세요");
		
		//개행하지 않고 출력
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("-------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "안";
		String str = "굿모닝";
		String name = "김나라";
		char ss = '"'; 

		System.out.println(i);
		System.out.println(str);
		System.out.println(5+3);
		System.out.println("굿모닝"+"김나라");   //java에서는 '문자열+문자열' 정의해줌 이어붙이기
		System.out.println(str+name);
		System.out.println(str+name+str);

		System.out.println(i+i);             //정수 + 정수
		System.out.println(i+d);             //정수 + 실수 (자동형변환)
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result = name + d;            //문자열 + 정수,실수  ==> 이어붙이기
		System.out.println(result);
		
		//굿모닝랑김나라
		
		System.out.println(str+"랑"+name);
		
		//굿모닝 랑 김나라
		System.out.println(str+" 랑 "+name);
		
		//굿모닝 김나라
		System.out.println(str+" "+name);
		
		//제이름은 김나라 입니다.
		System.out.println("제이름은 "+name+" 입니다.");
		System.out.println("--------------------------------");
		
		System.out.println(c+c);           //char형은 코드값이기 때문에 숫자로 변환되어 더해지게 됨
		
		//제이름은 "김나라" 입니다.
		System.out.println("제이름은 \""+name+"\" 입니다.");     //문자열 내에서 "를 표시하려면 \"
		System.out.println("제이름은 "+ss+name+ss+" 입니다.");
		
		//제이름은 \김나라\ 입니다.
		System.out.println("제이름은 \\"+name+"\\ 입니다.");
		
		System.out.println("제이름은\t"+name+"\t입니다.");
		System.out.println("제이름은\n"+name+"\n입니다.");
		
		
		
		
		
		
	}

}
