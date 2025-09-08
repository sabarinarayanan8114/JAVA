import java.util.Scanner;
public class positivenegative {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int number = kbd.nextInt();
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
