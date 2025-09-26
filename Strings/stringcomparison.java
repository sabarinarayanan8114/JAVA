package Strings;

import java.util.Scanner;

public class stringcomparison {
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
	    String name=new String(kbd.next());
		String name1=kbd.next();
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.compareTo(name1));

	}

}
