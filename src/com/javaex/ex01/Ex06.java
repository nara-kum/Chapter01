package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
//		자동형변환
//		다른 자료형(정수+실수)
		double var01 = 2 + 3.5;        // 2 -> 2.0 자동으로 형변환
		System.out.println(var01);
		
		double var02 = 3.0 + 6;
		System.out.println(var02);
		
		
		
//		강제형변환
		float var05 = 111.6465F;
		int   var06 = (int)var05;
		System.out.println(var06);
		
//		강제형변환 ( 확대 byte(1) ->int(4))
		byte var07 = 10;
		System.out.println(var07);
		
		int result02 = (int)var07;
		System.out.println(result02);
		
//		강제형변환 ( ★★★축소 정상 int(4) -> byte(1)★★★)
		int var08 = 10;
		System.out.println(var08);
		
		byte result03 = (byte)var08;
		System.out.println(result03);
		
//		강제형변환 ( ★★★축소 비정상 int(4) -> byte(1)★★★)
		int var09 = 203029770;
		System.out.println(var09);

		byte result04 = (byte)var09;
		System.out.println(result04);
		
//		강제형변환 ( 실수 -> 정수)
		double var10 = 5.57;
		System.out.println(var10);
		
		int result05 = (int)var10;
		System.out.println(result05);
		

//		강제형변환 ( 정수 -> 실수)
		int var11 = 7;
		System.out.println(var11);
		
		double result06 = (double)var11;
		System.out.println(result06);
		
		
		
		
		
	}

}
