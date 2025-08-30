import java.util.*;
public class countdigits{
public static void main(String []args){
    Scanner kbd=new Scanner (System.in);
    int n=kbd.nextInt();
    int temp=n;
    int count=0;
    while(n>0){
        n=n/10;
        count++;
    }
    int div=(int)Math.pow(10, count-1);
    while (div>0) {
        int dig =(temp/div)%10;
        System.out.print(dig+"");
        div=div/10;
    }
    kbd.close();
}
}