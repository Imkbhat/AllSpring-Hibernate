package com.love2code.java8;

public interface Java8Interface {
	
	default void runner() {
		System.out.println("Runs");
	}
	
	static void runner2() {
		System.out.println("Runner 2");
	}
	
	void kiran();
}
