package com.javaex.ex04;

public class LowerImpl implements Runnable{

	@Override
	public void run() {
		
		for(char i='A'; i<'Z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	
	}

}
