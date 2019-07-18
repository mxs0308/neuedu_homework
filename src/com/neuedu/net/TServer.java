package com.neuedu.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TServer {

	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8888);
			System.out.println("服务器启动");
			while(true){
				Socket s = ss.accept();
				System.out.println("连接的客户端ip "+s.getInetAddress().getHostAddress());
				Servicer ser = new Servicer(s);
				Thread t = new Thread(ser);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
