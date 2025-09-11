package sabari_project1;

import java.util.Scanner;

 public class Arraymultiply{
	 public static void main(String args[]) {
		Scanner kbd=new Scanner(System.in);
		System.out.println("Enter the ArraySize :");
		int size=kbd.nextInt();
		int arr[]=new int[size];
		int mul=1;
				for(int i=0;i<size;i++) {
					arr[i]=kbd.nextInt();
					mul*=arr[i];
					}
				System.out.print("Mul = "+mul);
	}

	}


