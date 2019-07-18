package com.neuedu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//从磁盘文件中读取数据到内存，在控制台
		File file = new File("D:/io/t1.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			
			System.out.println("read method " + (char)fis.read());
			System.out.println("read method " + (char)fis.read());
			
			byte[] b = new byte[fis.available()];
			fis.read(b);
			for(int i = 0;i <b.length;i++) {
				System.out.println((char)b[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
