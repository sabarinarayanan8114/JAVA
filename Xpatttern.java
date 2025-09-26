package ForLoop;
import java.util.Scanner;
public class Xpatttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        int n = num.length();       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {        
                if (i == j || (i + j) == (n - 1)) {
                    System.out.print(num.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
        sc.close();
    }
}
