package com.neuedu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D:/io/t1.txt");
			
			br = new BufferedReader(fr);
			
			System.out.println((char)br.read());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			
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
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		try {
			FileWriter fw = new FileWriter("D:/io/o1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("hello world");
			bw.newLine();
			bw.write("hfsafhfaflsf");
			
			bw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
