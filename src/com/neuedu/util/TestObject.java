package com.neuedu.util;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student("zhangsan");
		Student stu2 = new Student("zhangsan");
		
		Student stu3 = stu1;
		
		System.out.println(stu1.equals(stu2));
		
		//引用类型，比较在是地址
		System.out.println(stu1 == stu2);
		
		System.out.println(stu1.equals(stu3));
		
		//基本数据类型，byte\int \short\long,float\double,char,boolean
		int n1 = 100;
		int n2 = 100;
		
		//基本数据类型，比较值
		if(n1 == n2) {
			System.out.println("n1等于n2");
		} else {
			System.out.println("n1不等于n2");
		}
		
		System.out.println(stu1.toString());
		System.out.println(stu1.hashCode());
		

	}

}
