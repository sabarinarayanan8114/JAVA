package array;

//import java.util.Scanner;
public class Arraymethod {
	static void count(int m, int[] a) {
		int count = 0, s = a.length;
		for (int i = 0; i < s; i++) {
			if (a[i] < m) {
				count++;
			}
			System.out.println(count);
		}
	}
}
