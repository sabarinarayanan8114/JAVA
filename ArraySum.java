package sabari_project1;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
	Scanner kbd=new Scanner(System.in);
	System.out.println("Enter the ArraySize :");
	int size=kbd.nextInt();
	int arr[]=new int[size];
	int sum=0;
			for(int i=0;i<size;i++) {
				arr[i]=kbd.nextInt();
				sum+=arr[i];
				}
			System.out.print("Sum = "+sum);
}

}
