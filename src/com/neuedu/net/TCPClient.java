package com.neuedu.net;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket s = null;
		BufferedWriter out = null;
		try {
			s = new Socket("10.25.44.139", 6688);
			System.out.println("与服务器端建立连接...");
			System.out.println("客户端输入信息：");

			Scanner sc = new Scanner(System.in);
			String clientStr = sc.nextLine();
			
			out = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream()));
			out.write(clientStr);
			out.flush();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
