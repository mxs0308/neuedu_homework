package com.neuedu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTcpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket ss = null;
		BufferedReader in = null;
		try {
			ss = new ServerSocket(9999);
			System.out.println("服务器启动");
			Socket socket = ss.accept();
			
			System.out.println("连接建立");
			System.out.println(socket.getInetAddress().getHostAddress());
			
			//服务器接收客户端发送的数据
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String clientContent = in.readLine();
			
			System.out.println("接收客户端消息： " +clientContent);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	

}
