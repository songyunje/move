package com.ssafy.di2;

public class Test {
	public static void main(String[] args) {
		
		Desktop computer = new Desktop();
		Programmer p = new Programmer(computer);
		p.coding();
		
	}
}
