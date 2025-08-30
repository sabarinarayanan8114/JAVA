import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner kbd=new Scanner (System.in);
        System.out.print("Enter The Number:");
        int n=kbd.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("The Number"+i+"is Even");
            }
            else
                System.out.println("The Number"+i+"is odd");
            }

            kbd.close();
        }
    }
