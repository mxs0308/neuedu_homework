package com.neuedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestFileCopy1 test = new TestFileCopy1();
		
		test.copyFile("D:/io/t1.txt", "D:/io/o1.txt");
		

	}
	
	
	/**
	 * 定义一个文件copy
	 * @param sourceFile 源文件名称，包含路径名和源文件名
	 * @param desFile 目标文件名称，包含路径名和目标文件名
	 */
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
