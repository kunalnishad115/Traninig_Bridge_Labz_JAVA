package DAY1_TRAINING;

import java.util.Scanner;

public class Basics {

    // 🔹 1. Operators
    private static boolean basicOperators(int a, int b) {
        return a > b;
    }

    // 🔹 2. Input / Output
    private static void inputOutput(String name, int age, String des) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Description: " + des);
    }

    // 🔹 3. Literals & Variables
    private static void aboutLiterals() {
        int num = 10;              // integer literal
        double price = 99.99;     // decimal literal
        char grade = 'A';         // character literal
        String name = "Kunal";    // string literal
        boolean flag = true;      // boolean literal

        System.out.println("Integer: " + num);
        System.out.println("Double: " + price);
        System.out.println("Char: " + grade);
        System.out.println("String: " + name);
        System.out.println("Boolean: " + flag);
    }

    // 🔹 4. If-Else
    private static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }
    }

    // 🔹 5. Loops
    private static void loopExample(int n) {
        System.out.println("For Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // 🔹 6. break & continue
    private static void breakContinueExample() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            if (i == 5) break;    // stop at 5
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 🔹 MAIN DRIVER
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mode (Input / Operator / IfElse / Loop / Literals / Break): ");
        String info = sc.nextLine();

        switch (info.toLowerCase()) {

            case "input":
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine(); // 🔥 FIX: consume leftover newline

                System.out.print("Enter Description: ");
                String des = sc.nextLine();

                inputOutput(name, age, des);
                break;

            case "operator":
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println("Is a > b ? " + basicOperators(a, b));
                break;

            case "ifelse":
                System.out.print("Enter Age: ");
                int userAge = sc.nextInt();
                checkEligibility(userAge);
                break;

            case "loop":
                System.out.print("Enter limit: ");
                int n = sc.nextInt();
                loopExample(n);
                break;

            case "literals":
                aboutLiterals();
                break;

            case "break":
                breakContinueExample();
                break;

            default:
                System.out.println("Invalid Option!");
        }

        sc.close();
    }
}