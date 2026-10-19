import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Exercise 1 =====");
        int age = 20;
        double height = 1.62;
        char firstInitial = 'H';
        boolean enrolledBIT235 = true;
        String fullName = "HuJingting";
        String studentID = "1580646";

        System.out.println("Full name: " + fullName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
        System.out.println("Height in metres: " + height);
        System.out.println("First initial: " + firstInitial);
        System.out.println("Enrolled in BIT235: " + enrolledBIT235);


        System.out.println("\n===== Exercise 2 =====");
        int a = 12;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("Explanation for division: When two int values divide in Java, it performs integer division. It discards decimal fractions directly without rounding. 12 /5 gives 2 instead of 2.4.");


        System.out.println("\n===== Exercise 3 =====");
        int total = 7;
        int count = 2;
        double average = (double) total / count;
        System.out.println("Average = " + average);


        System.out.println("\n===== Exercise 4 =====");
        System.out.print("Please enter your age: ");
        int userAge4 = scanner.nextInt();
        if(userAge4 >= 18){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are under 18.");
        }
        scanner.nextLine();


        System.out.println("\n===== Exercise 5 =====");
        System.out.print("Please enter a number: ");
        double num5 = scanner.nextDouble();
        if(num5 > 0){
            System.out.println("Positive");
        }else if(num5 < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        scanner.nextLine();


        System.out.println("\n===== Exercise 6 =====");
        System.out.print("Enter an integer: ");
        int num6 = scanner.nextInt();
        if(num6 % 2 == 0){
            System.out.println("This number is even");
        }else{
            System.out.println("This number is odd");
        }
        scanner.nextLine();


        System.out.println("\n===== Exercise 7 =====");
        System.out.print("Enter your mark (0‑100): ");
        int mark = scanner.nextInt();
        if(mark >=80 && mark <=100){
            System.out.println("HD");
        }else if(mark >=70){
            System.out.println("D");
        }else if(mark >=60){
            System.out.println("C");
        }else if(mark >=50){
            System.out.println("P");
        }else{
            System.out.println("F");
        }
        scanner.nextLine();


        System.out.println("\n===== Exercise 8 =====");
        int temperature = 32;
        System.out.println("Temperature value is " + temperature);
        if(temperature >30){
            System.out.println("It is hot.");
        }else if(temperature >=20 && temperature <=30){
            System.out.println("It is mild.");
        }else{
            System.out.println("It is cold.");
        }


        System.out.println("\n===== Exercise 9 =====");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(username.equals("admin") && password.equals("java123")){
            System.out.println("Login successful.");
        }else{
            System.out.println("Access denied.");
        }
        System.out.println("\nExplanation: == compares object memory address for String objects in Java, not text content. The .equals() method compares the actual character content inside strings. So we must use .equals() for String equality check.");


        System.out.println("\n===== Exercise 10 =====");
        System.out.print("Please enter your age: ");
        int driveAge = scanner.nextInt();
        System.out.print("Do you have a driver licence? (true/false): ");
        boolean hasLicence = scanner.nextBoolean();

        if(driveAge >=18 && hasLicence){
            System.out.println("You can drive independently.");
        }else if(driveAge >=16 && driveAge <18 && hasLicence){
            System.out.println("You can drive with restrictions.");
        }else{
            System.out.println("You cannot drive.");
        }

        scanner.close();
    }
}
