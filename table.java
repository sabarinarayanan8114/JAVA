import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = kbd.nextInt();
        System.out.print("Enter the range:");
        int r = kbd.nextInt();
        for(int i=1;i<=r;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }

    }
}
