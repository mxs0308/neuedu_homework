package com.neuedu.util;

public class Test1 {
	
	public static void main (String[] args) {
		
		//字符串----基本
		String s1 = "123";
		
		int n1 = Integer.parseInt(s1);
		
		System.out.println(n1);
		
		//基本 --- 字符串
		
		String s2 = String.valueOf(n1);
		
		//字符串----包装类
		
		//用对应包装类在构造器
		
		//包装类 --- 字符串
		
		Float f1 = (float)123.45;//自动装箱
		
		String str2 = Float.toString(f1);
		str2 = f1.toString();
		
		
		
	}

}
