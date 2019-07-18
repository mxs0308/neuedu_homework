package com.neuedu.util;

public class TestString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "hello";
		
		String str2 = "hello";
		
		String str3 = "hello word";
		
		String s1 = new String("haha");
		String s2 = new String("haha");
		
		System.out.println(str1 == str2); //引用比较
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		//
		str1 = str3;
		System.out.println(str1);
		
		System.out.println(str1 == str2);
		
		
		String str = "abchahaooossshellopooohelloyyysjfdsfjfadsf";
		
		System.out.println(str.indexOf(str2));
		
		System.out.println(str.indexOf(str2, 16));
		
		//sql  select * from Product where name= product.getName() and price < product.getPrice()
		
		StringBuffer sql = new StringBuffer("select * from Product where 1 = 1 ");
		
//		if(product.getName() != null && "".equals(product.getName())) {
			sql.append(" and name= product.getName()");
//		}
			

	}

}
