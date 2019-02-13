package com.love2code.map;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapImpl {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> weakHashMap = new WeakHashMap<>();
		
		weakHashMap.put(1, "kiran");
		weakHashMap.put(2, "karthik");
		weakHashMap.put(3, "kavya");
		weakHashMap.put(4, "koushik");
		weakHashMap.put(5, "Lakshmi");
		
		Map<Integer, String> anotherWHM = new WeakHashMap<>();
		
		anotherWHM.put(6, "Beede");
		anotherWHM.put(7, "Demlapura");
		anotherWHM.put(8, "Konandur");
		anotherWHM.put(9, "Theerthahalli");
		anotherWHM.put(10, "Shiimoga");
		
		weakHashMap.putAll(anotherWHM);

		Set<Integer> keySet = weakHashMap.keySet();
		System.out.println(keySet);
		
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer ele = it.next();
			System.out.println("============="+ele);
			
		}
		
		Set<Map.Entry<Integer,String>> keyValSet = weakHashMap.entrySet();
		System.out.println(keyValSet);
		
		
		System.out.println(weakHashMap.containsKey(6));
		
		System.out.println(weakHashMap.get(1));
		
		System.out.println(weakHashMap.size());
		
	}

}
