package com.neuedu.util;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//随机生成1-50之间的7个整数
		
		System.out.println(Math.floor(5.6));
		
		
		for(int i = 1; i<=7; i++) {
			double r1 = Math.random() * 50;
			System.out.println((int)(Math.ceil(r1)));
			
			
		}
		
		System.out.println("-------------");
		
		Random rd = new Random();
		for(int i = 1; i<=7; i++) {
					
			System.out.println(rd.nextInt(50)+1);
		}
	}

}
