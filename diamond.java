import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        int n=kbd.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++)
                System.out.print(" ");
            for(int col=1;col<=2*(row-1);col++)
             System.out.print("*");
              System.out.println();  
        }
        for(int row=n-1;row>=1;row--){
   for(int col=1;col<=n-row;col++)
   System.out.print(" ");
    for(int col=1;col<=2*row-1;col++)
    System.out.print("*");
              System.out.println();  
        }
    }
}