package com.ssafy.fit.util;

import java.util.Scanner;

public class SsafitUtil {
	private static Scanner sc = new Scanner(System.in);
	
	private SsafitUtil() {}
	
	public static String input(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	public static int inputInt(String msg) {
		return Integer.parseInt(input(msg));
	}
	
	public static void printLine() {
		printLine('-', 80);
	}

	public static void printLine(char ch) {
		printLine(ch, 80);
	}
	
	public static void printLine(char ch, int len) {
		for (int i = 0; i < len; i++) System.out.print(ch);
		
		System.out.println();
	}
	
	public static void screenClear() {
		System.out.print("\033[H\033[2J");
        System.out.flush();
	}
}
