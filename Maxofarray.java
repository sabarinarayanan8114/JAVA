package sabari_project1;

import java.util.Scanner;

public class Maxofarray {
	public static void main(String[] args) {
	 
		Scanner kbd=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int size=kbd.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Number:");
		
				for(int i=0;i<size;i++) {
					arr[i]=kbd.nextInt();}
				int max=arr[0];
				for(int i=1;i<size;i++) {
					if(max<arr[i]) {
						max=arr[i];
					}	
				}
				System.out.println("MAX "+max);
				
}					
}


