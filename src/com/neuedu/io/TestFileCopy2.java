package com.neuedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestFileCopy2 test = new TestFileCopy2();
		
		test.copyFile("D:/io/t1.txt", "D:/io/o3.txt");
		

	}
	
	
	/**
	 * 定义一个文件copy
	 * @param sourceFile 源文件名称，包含路径名和源文件名
	 * @param desFile 目标文件名称，包含路径名和目标文件名
	 */
	public void copyFile(String sourceFile,String desFile){
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(sourceFile);
			fw = new FileWriter(desFile);
			
			char[] c = new char[1024];
			int n = 0;
			while((n = fr.read(c)) != -1){
				fw.write(c,0,n);
				fw.flush();
			}
			
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
