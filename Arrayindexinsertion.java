package array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayindexinsertion {
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int size=kbd.nextInt();
		int arr[]=new int[size+1];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+i +" Element :");
			arr[i]=kbd.nextInt();}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the Array Size :");
		int index=kbd.nextInt();
		System.out.println("Insertion Element :");
		int ele=kbd.nextInt();
		for(int i =size-1;i>=index;i--)
			arr[i+1]=arr[i];
		arr[index]=ele;
		System.out.println(Arrays.toString(arr));

}}

