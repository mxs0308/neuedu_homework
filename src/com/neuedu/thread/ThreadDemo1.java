package com.neuedu.thread;

public class ThreadDemo1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//输出1-20之间在整数
		for(int i = 1;i<=20;i++) {
			
			System.out.println(Thread.currentThread().getName() + " "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
