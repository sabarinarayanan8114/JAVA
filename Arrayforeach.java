package sabari_project1;

import java.util.Arrays;
import java.util.Scanner;
class Arrayforeach{
public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		int size=kbd.nextInt();
		int arr[]=new int[size];
				for(int i=0;i<size;i++) {
					arr[i]=kbd.nextInt();}
			for(int var:arr) {
			System.out.print(var+" ");
	 			}
				System.out.println(Arrays.toString(arr));
	}
}
