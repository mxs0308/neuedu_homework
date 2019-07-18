package com.neuedu.thread;

import java.util.HashSet;
import java.util.Set;

public class SingletonThread implements Runnable {

	Set<Singleton2> set = new HashSet<>();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Singleton2 s3 = Singleton2.getInstance();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		set.add(s3);
		
		System.out.println(set.size());
		System.out.println(set);

	}

}
