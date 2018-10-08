package com.capgemini.core.a82;

public class MainTimerClass {
	
	public static void main(String[] args) {
		
		Timerthread t=new Timerthread();
		Thread th=new Thread(t);
		th.start();
		
	}

}
