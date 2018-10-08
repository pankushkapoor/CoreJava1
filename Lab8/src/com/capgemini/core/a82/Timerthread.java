package com.capgemini.core.a82;

public class Timerthread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=10;
		while(i>=1)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Timer "+i);
			i--;
			if(i==0)
			{
				System.out.println("Timer Restarts");
				i=10;
			}
			
		}
	}

}
