package com.neuedu.thread;

public class TestThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个线程类
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.setName("线程1");
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.setName("线程2");
		
		System.out.println("线程2优先级 " + t2.getPriority());
		
		t2.setPriority(9);
		
		t1.start();
		
		
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//输出1-20之间在整数
		for(int i = 1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName() + " "+i);
		}

	}

}
