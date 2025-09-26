package Strings;

import java.util.Scanner;

public class strtrueorfalse {
	public static void main(String[] args) {
Scanner kbd=new Scanner(System.in);
String name=new String(kbd.next());
String name1=kbd.next();
boolean res=name.equalsIgnoreCase(name1);
System.out.println(res);
	}
}
