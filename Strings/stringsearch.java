package Strings;

import java.util.Scanner;

public class stringsearch {
public static void main(String[] args) {
	 Scanner kbd=new Scanner(System.in);
	    String str="Hello Java World";
		
		System.out.println("Index of 'Java': " + str.indexOf("Java"));
	        System.out.println("Last Index of 'l': " + str.lastIndexOf('l'));
		System.out.println("Character at index 2: " + str.charAt(2));
}
}
