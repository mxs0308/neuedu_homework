package com.neuedu.util;

import java.util.Calendar;

public class TestCalendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cad = Calendar.getInstance();
		cad.set(2019, 10, 11);
		
		System.out.println(cad);
		
		//xxxx年xx月xx日 xx周,xxxx-xx-xx
		System.out.println(cad.get(Calendar.YEAR)+"年 "+(cad.get(Calendar.MONTH)+1) + "月 " +
		cad.get(Calendar.DAY_OF_MONTH) + "日 "+cad.get(Calendar.WEEK_OF_YEAR) + "周" +
				"星期"+(cad.get(Calendar.DAY_OF_WEEK)-1));


	}

}
