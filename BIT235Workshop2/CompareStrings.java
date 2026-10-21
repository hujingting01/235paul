import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        boolean isEqual = str1.equals(str2);
        System.out.println("the two given strings are equal: " + isEqual);

        char char1 = str1.charAt(0);
        char char2 = str2.charAt(0);
        System.out.println("First character of string1: " + char1);
        System.out.println("First character of string2: " + char2);
        System.out.println("First characters equal: " + (char1 == char2));

        scanner.close();
    }
}
