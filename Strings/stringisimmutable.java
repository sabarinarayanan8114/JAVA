package Strings;

import java.util.Scanner;

public class stringisimmutable {
	public static void main(String[] args) {
	    Scanner kbd=new Scanner(System.in);
	    String str=kbd.next();
		String str1=kbd.next();
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
}
}
