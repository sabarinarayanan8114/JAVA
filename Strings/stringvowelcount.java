package Strings;

public class stringvowelcount {
public static void main(String[] args, String str) {
	String[] words = str.trim().split(" ");
    System.out.println("Split words:");
    for (String word : words) {
        System.out.println(word);
    }

    String joined = String.join("-", "One", "Two", "Three");
    System.out.println("Joined String: " + joined);

}
}
