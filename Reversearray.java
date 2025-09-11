package sabari_project1;

import java.util.Scanner;

public class Reversearray {public static void main(String[] args) {
	Scanner kbd=new Scanner(System.in);
	System.out.print("Enter the Array Size :");
	int size=kbd.nextInt();
	System.out.print("Enter the ArrayElements :");
	int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=kbd.nextInt();}
			for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			}

}
}