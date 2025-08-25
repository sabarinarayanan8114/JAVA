import java.util.*;
class condition{
    public static void main(String args[]){
        Scanner kbd=new Scanner(System.in);
        char choice=kbd.next().charAt(0);
        switch(choice){
            case 'A':System.out.println("Withdraw"); break;
            case 'B':System.out.println("deposit");break;
            case 'C':System.out.println("Balance Check"); break;
            default: System.out.println("Thank You Please Enter A-C");
        }
    }
}