package array;

import java.util.Arrays;
import java.util.Scanner;

public class arraydeletion {
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int size=kbd.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter the "+i +" Element :");
			arr[i]=kbd.nextInt();}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the deletion index :");
		int ele=kbd.nextInt();
		for(int i =ele;i<size-1;i++)
			arr[i]=arr[i+1];
		
		for(int i=0;i<size-1;i++)
		System.out.println(arr[i]+" ");

}}
