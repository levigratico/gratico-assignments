package com.gratico.assignments.util;

import java.util.Scanner;

public class CommonUtility {
	
	public static String readLine() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public static void print(String message) {
		System.out.print(message);
	}
	
	public static void print(String format, Object...args) {
		System.out.print(String.format(format, args));
	}
	
	public static String read() {
		Scanner s = new Scanner(System.in);
		return s.next();
	}
	
	public static void printLine(String format, Object... args) {
		System.out.println(String.format(format, args));
	}
	
	public static void printLine(String message) {
		System.out.println(message);
	}
	
}
