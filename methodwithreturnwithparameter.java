package array;

import java.util.Scanner;

public class methodwithreturnwithparameter {
   static int add(int a,int b)
   {
	return a+b;}
   public static void main(String[]args){
	   Scanner kbd=new Scanner(System.in);
	   int n1=kbd.nextInt();
	   int n2=kbd.nextInt();
	   System.out.println(add(n1,n2));
   }
}
