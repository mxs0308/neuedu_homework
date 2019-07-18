package com.neuedu.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("10.25.44.139",8888);
		
		System.out.println("连接建立");
		
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			 PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
			while(true){	
				//客户端从控制台读取数据，发送给服务器
				Scanner sc = new Scanner(System.in);				
			    System.out.println("客户端：");
			    
			    String str = sc.nextLine();
			    out.println(str);
			    
			    //中断连接
			    if(str.equals("exit")){
			    	break;
			    }
			    
			    //客户端读取服务器端发送的数据
			    String msg = in.readLine();
			    System.out.println("接收服务器数据："+msg);
			}
			System.out.println("客户端退出");
		}
		finally{
			s.close();
		}

	}

}
