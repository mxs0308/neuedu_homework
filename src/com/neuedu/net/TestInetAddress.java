package com.neuedu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
			
			System.out.println(inetAddress.getHostAddress());
			System.out.println(inetAddress.getHostName());
			
			InetAddress localAddress = InetAddress.getLocalHost();
			
			System.out.println(localAddress.getHostAddress());
			System.out.println(localAddress.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
