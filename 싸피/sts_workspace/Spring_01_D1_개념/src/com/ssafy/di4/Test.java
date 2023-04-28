package com.ssafy.di4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Programmer p = new Programmer();
		Computer computer = ComputerFactory.getComputer(sc.next());
		p.setComputer(computer);
		
		p.coding();
		
		computer = ComputerFactory.getComputer(sc.next());
		p.setComputer(computer);
		
		p.coding();
	}
}
