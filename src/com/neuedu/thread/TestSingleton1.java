package com.neuedu.thread;

public class TestSingleton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		System.out.println(s1 == s2);
		
		
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		
		System.out.println(s3 == s4);

	}

}
