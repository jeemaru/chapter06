package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//출장가라 준비되는대로 시작
		Thread thread = new DigitThread();
		thread.start();
		
		for(char ch =65; ch<='Z'; ch++) {
			
			System.out.println(ch);
			
		}

	}

}
