package com.neuedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("D:/io/o2.txt");
			
			char[] c =new char[20];
			c[0] = 'a';
			c[1] = 'b';
			c[3] = 'c';
			c[4] = 'd';
			
			fw.write(c);
			
			fw.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	//定义一个文件copy方法
	public void copyFile(String sourceFile,String desFile){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(sourceFile);
			byte[] b = new byte[fis.available()];
			fis.read(b);
			
			fos = new FileOutputStream(desFile);
			fos.write(b);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
