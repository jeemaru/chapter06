package com.javaex.ex02;

public class LowerThread extends Thread{

	@Override
	public void run() {
		for(char i='A'; i<'Z'; i++) {
			System.out.println(i);
		};
	}
	
	

}
