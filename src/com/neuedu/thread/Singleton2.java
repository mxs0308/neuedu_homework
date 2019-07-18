package com.neuedu.thread;

public class Singleton2 {
	private Singleton2(){}
	
	private static Singleton2 singleton = null;
	
	public static Singleton2 getInstance(){
		
		
		if(singleton == null) {
			synchronized(Singleton2.class){
				if(singleton == null) {
					System.out.println("--单例构造器被执行--------------");
					singleton = new Singleton2();
				}
			}
		}
		
		return singleton;
		
	}
	

}
