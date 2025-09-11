package sabari_project1;

import java.util.Scanner;

public class Minofarray {public static void main(String[] args) {
	 
		Scanner kbd=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int size=kbd.nextInt();
		int arr[]=new int[size];
				for(int i=0;i<size;i++) {
					System.out.println("Enter the Number:");
					arr[i]=kbd.nextInt();}
				int min=arr[0];
				for(int i=1;i<size;i++) {
					if(min>arr[i]) {
						min=arr[i];
					}	
				System.out.println("MIN"+min);
				}
}					
}
