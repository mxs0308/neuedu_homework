package com.neuedu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("D:/io/t1.txt");
			
			br = new BufferedReader(fr);
			fw = new FileWriter("D:/io/o1.txt",true);
			bw = new BufferedWriter(fw);
			String data = null;
			while((data = br.readLine()) != null){
				bw.write(data);
				bw.newLine();
			}
			
			bw.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				
				br.close();
				fr.close();
			
				fw.close();
				bw.close();

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}
