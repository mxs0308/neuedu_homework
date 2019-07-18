package com.neuedu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TClient {

	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("10.25.44.139", 8888);
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
			while (true) {
				System.out.println("已连接");
				
				String msg = in.readLine();
				System.out.println("接收服务器数据：" + msg);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("客户端：");
				String str = sc.nextLine();
				//将控制台输入的信息，发送给服务器
				out.println(str);
				
				if (str.equals("exit")) {
					break;
				}
				//接收服务器端传来的信息
				
			}
			System.out.println("客户端退出");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
