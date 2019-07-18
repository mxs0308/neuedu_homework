package com.neuedu.set;

import java.util.ArrayList;
import java.util.List;

public class TestList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Student> stuList = new ArrayList<Student>();
		
		List<Student> stuList = new ArrayList<>();
		Teacher t1 = new Teacher("zhang",30);
		
		Student stu = null;
		
		for(int i= 1;i<11;i++){
			
			stu = new Student("tom1" + i,16+i);
			stuList.add(stu);
//			stuList.add(t1);
		}
		
		for(Student stu2:stuList) {
			System.out.println(stu2.getName());
		}
		
		System.out.println("--------------");
		List<Student> stuList2 = new ArrayList<>();
		
		for(int i= 1;i<11;i++){
			Student stu3 = new Student();
			stu3.setName("john"+i);
			stu3.setAge(16+i);
			stuList2.add(stu3);
//			stuList.add(t1);
		}
		
		for(Student stu4:stuList2) {
			System.out.println(stu4.getName());
		}

	}

}
