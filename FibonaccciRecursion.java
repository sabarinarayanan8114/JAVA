package ForLoop;
import java.util.*;
public class FibonaccciRecursion {
	public static void main(String args[]){

		Scanner kbd=new Scanner(System.in);

		int num1=kbd.nextInt();

		System.out.print(fibo(num1));

		}
		static int fibo(int n){

		if(n==0 ||n==1)

		return n;

		return fibo(n-1)+fibo(n-2);
		
}
}