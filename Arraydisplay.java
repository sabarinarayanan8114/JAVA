import java.util.Scanner;
public class Arraydisplay {
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		int size=kbd.nextInt();
		int arr[]=new int[size];
				for(int i=0;i<size;i++) {
					arr[i]=kbd.nextInt();}
				for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
				}
	}
}
