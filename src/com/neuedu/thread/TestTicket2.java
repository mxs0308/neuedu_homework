package com.neuedu.thread;

public class TestTicket2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SaleTicket2 st = new SaleTicket2();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		Thread t3 = new Thread(st);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
