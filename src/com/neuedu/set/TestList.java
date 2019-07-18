package com.neuedu.set;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	
	

	//debug调试
	//f5 进入调用的方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list1 = new ArrayList();
		
		for(int i= 1;i<10;i++){
			list1.add(i);
		}
		
		System.out.println(list1);
		list1.remove(5);
		
		System.out.println(list1);
		
		Student s1 = new Student("zhangsan",18);
		
		list1.add(3, s1);
		
		list1.add(s1);
		
		if(list1 !=null && list1.size() != 0){
			list1.contains(9);
		}else{
			
		}
		System.out.println(list1);
		
		for(int i = 0;i<list1.size();i++) {
			System.out.print(list1.get(i) +"  ");
			if(list1.get(i) instanceof Student) {
				Student stu1 = (Student)list1.get(i);
				System.out.println(stu1.getName());
				
			}
		}
		
		

	}

}
