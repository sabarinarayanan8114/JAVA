import java.util.*;
public class NeonNumber{
    public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=kbd.nextInt();
        int sq=n*n;
        int sum=0;
        while(sq>0){
            int dig=sq%10;
            sum=sum+dig;
            sq=sq/10;
        }
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.
            println("Not Neon Number");
        }
        kbd.close();
    }
}