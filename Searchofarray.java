package sabari_project1;

import java.util.Scanner;

public class Searchofarray {
	public static void main(String[] args) {
		 
		Scanner kbd=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int size=kbd.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Number:");
		
				for(int i=0;i<size;i++) {
					arr[i]=kbd.nextInt();}
				int search=kbd.nextInt();
				boolean find=false;
				int i;
				for(i=0;i<size;i++) {
					if(arr[i]==search) {
		             find=true;
		             break;}}
				if(find)
					System.out.println(i);
				else
					System.out.println(-1);
					}	
				
				
}					
