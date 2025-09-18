package array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayleftrotation {
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		int size=kbd.nextInt();
		int arr[]=new int[size+1];
				for(int i=1;i<=size;i++) {
					arr[i]=kbd.nextInt();}
				System.out.print(Arrays.toString(arr));
				int leftrt=kbd.nextInt();
				for(int j=1;j<leftrt;j++)
					 int temp=arr[0];
				
				arr[i]=arr[i+1];
				arr[size-1]=temp;
				{
				System.out.print(Arrays.toString(arr));
				}
	}

}
