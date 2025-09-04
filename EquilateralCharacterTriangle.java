import java.util.*;
public class EquilateralCharacterTriangle {
    public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=kbd.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j));
            }
            for(int j=i-2;j>=0;j--){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }

    
}
