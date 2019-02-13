package com.love2code.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8Itried {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<Integer>();
		for (int i=0; i<10; i++) numList.add(i);
		
		//Iterator
		Iterator<Integer> it = numList.iterator();
		while(it.hasNext()){
			System.out.println("Element======"+it.next());
		}
		
		numList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
			}
			
		});
		MyClass action = new MyClass();
		numList.forEach(action);
	}
}

class MyClass implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("==============="+t);
	}
	
}
