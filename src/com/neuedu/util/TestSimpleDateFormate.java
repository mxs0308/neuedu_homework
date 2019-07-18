package com.neuedu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss w W 星期u");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(new Date());
		String dateString = sdf.format(new Date());
		
		System.out.println(dateString);
		
		String dateString2 = "2020-7-9";
		try {
			Date date1 = sdf2.parse(dateString2);
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
