package com.wooui.hihocoder;

import java.util.Scanner;

public class N1000 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNext()) {
		String s= scanner.nextLine();
		int a = Integer.parseInt(s.split(" ")[0]);

		int b = Integer.parseInt(s.split(" ")[1]);
		System.out.println(a + b);
	} }
}
