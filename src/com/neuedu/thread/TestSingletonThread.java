package com.neuedu.thread;

public class TestSingletonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonThread st = new SingletonThread();
		
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
	}

}
