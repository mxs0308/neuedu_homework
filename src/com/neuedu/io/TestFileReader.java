package com.neuedu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//从磁盘文件中读取数据到内存，在控制台
		File file = new File("D:/io/t1.txt");
		try {
			FileReader fis = new FileReader(file);
			
			System.out.println("read method " + (char)fis.read());
			System.out.println("read method " + (char)fis.read());
			
			
			char[] c = new char[1024];
			int n ;
			int i = 0;
			
			fis.read(c);
			
//			while(( n = fis.read() )!= -1){
//				c[i] = (char)n;
//				i++;
//			}
			for(int j = 0;j <c.length;j++) {
				System.out.println((char)c[j]);
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
