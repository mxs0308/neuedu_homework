package com.neuedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.neuedu.util.Student;

public class TestObjectStream {
	public static void main(String[] args) {
		//创建2个学生对象，保存到文件中
		
		Student stu1 = new Student("tom");
		Student stu2 = new Student("john");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("D:/io/object1.txt");
			
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(stu1);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("D:/io/object1.txt");
			
			ois = new ObjectInputStream(fis);
			
			System.out.println(ois.readObject());
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
