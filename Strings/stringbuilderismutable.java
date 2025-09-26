package Strings;

import java.util.Scanner;

public class stringbuilderismutable {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String str = kbd.next();
		String str1 = kbd.next();
		StringBuilder name = new StringBuilder(kbd.next());
		StringBuilder name1 = new StringBuilder(kbd.next());
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
	}
}
