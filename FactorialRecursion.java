package ForLoop;
import java.util.*;
public class FactorialRecursion {

public static void main(String args[]){

Scanner kbd=new Scanner(System.in);

int num1=kbd.nextInt();

System.out.print(fact(num1));

}

static int fact(int n){

if(n==0 ||n==1)

return 1;

return (n*fact(n-1));

}
}