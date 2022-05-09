package com.javaex.ex04;

public class UpperImpl implements Runnable{

	@Override
	public void run() {
		
		for(char i='a'; i<'z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
