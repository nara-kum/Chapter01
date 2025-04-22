package com.javaex.ex4;

public class Ex09 {

	public static void main(String[] args) {
		
//		int no = 1;
//		
//		while(true) {
//			
//			if(no%6==0&&no%14==0) {
//				break;
//			}
//			
//			no++;
//		}
//		
//		System.out.println(no);
//	}
		
		int no = 1;
		
		boolean action = true;
		
		while(action) {
			
			if(no%6==0&&no%14==0) {
				action= false; //바로 while문을 나가지 않고 아래까지 흘러서 while문 모두 수행 후 나감
			}
			
			no++;
		}
		
		System.out.println(no);
	}
}
