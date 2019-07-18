package com.neuedu.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map1 = new HashMap();
		
		for(int i = 1; i < 10; i++){
			map1.put("key"+i, "value"+i);
		}
		
		System.out.println(map1);
		
		System.out.println(map1.get("key2"));
		
		//遍历map，先得到所有在key，然后再通过key，取得对应vule
		
		Set keySet1 = map1.keySet();
		Iterator it =keySet1.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj + " " +map1.get(obj));
			
		}
		
		

	}

}
