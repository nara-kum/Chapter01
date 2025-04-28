package com.javaex.ex05;

public class Ex11 {
	public static void main(String[] args) {
		
		int[] lArry = new int[]{10, 20, 30};
		int[] rArry = new int[]{10, 20, 30};
		
		
		if(lArry.length==rArry.length) {
			for(int i=0; i<lArry.length; i++) {
				if(lArry[i]!=rArry[i]){
				System.out.println(i+" 번째 값이 다릅니다.");
				}	
			}
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
	}

}
