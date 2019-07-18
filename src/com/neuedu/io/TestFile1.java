package com.neuedu.io;

import java.io.File;
import java.io.IOException;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file1 = new File("D:/io/t1.txt");
		
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(file1.getName());
		System.out.println(file1.getPath());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		
		File path = new File("D:/io/io3");
		if(!path.exists()) {
			try {
				path.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(!path.exists()) {
			path.mkdir();
			
		}
		
		File file2 = new File(path,"t2.txt");
		
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		System.out.println(file2.canRead());
		System.out.println(file2.canWrite());

	}

}
