package com.neuedu.net;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestTcpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		BufferedWriter out = null;
		
		//客户端发送数据，服务器端接收
		try {
			socket = new Socket("10.25.44.139",9999);
			System.out.println("与服务器连接了");
			
			
			Scanner sc = new Scanner(System.in);
			String content = sc.nextLine();
			
			out = new BufferedWriter((new OutputStreamWriter(socket.getOutputStream())));
			
			out.write(content);
			out.flush();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				out.close();
			
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
