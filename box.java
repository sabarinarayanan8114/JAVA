import java.util.*;
public class box {
    public static void main (String[]args){
        Scanner kbd=new Scanner(System.in);
        int n=kbd.nextInt();{
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
        if(i==1||j==1||i==n||j==n)
        System.out.print("*");
        else 
        System.out.print(" ");
        } 
        System.out.println();
       
    }}
}

}