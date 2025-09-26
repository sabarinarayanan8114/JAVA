package Strings;

import java.util.Scanner;

public class stringtrimming {
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
	    String str="Hello Java World";
		System.out.println("Trim: '" + str.trim() + "'");
	        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
	        System.out.println("Replace all spaces: " + str.replaceAll(" ", "_"));
	        System.out.println("Replace first space: " + str.replaceFirst(" ", "-"));
		
	}
}
