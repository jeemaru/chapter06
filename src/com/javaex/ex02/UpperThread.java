package com.javaex.ex02;

public class UpperThread extends Thread{

	@Override
	public void run() {
		for(char i='a'; i<'z'; i++) {
			System.out.println(i);
		}
	}
	
	

}
