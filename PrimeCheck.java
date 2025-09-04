import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
          Scanner kbd=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=kbd.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is not a prime number.");
    }
        
    }
    
}
