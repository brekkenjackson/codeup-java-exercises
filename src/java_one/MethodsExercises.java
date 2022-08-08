package java_one;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        myInteger(userInput, 1, 10);
        myFactorial(userInput);

    }


    public static int myAddition(int num1, int num2) {
        return num1 + num2;
    }

    public static int mySubtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int myMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int myDivision(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error");
        }
        return num1 / num2;
    }

    public static int myModulus(int n1, int n2) {
        return n1 % n2;
    }

    public static void myInteger(int userInput, int min, int max) {
        if (userInput > min && userInput < max) {
            System.out.println("The number is in range");
        } else {
            System.out.println("The number is not in range");
        }
    }

    public static void myFactorial(int userInput) {

        if (userInput >= 1 && userInput <= 10) {
            long i,fact=1;
            for(i=1;i<=userInput;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+userInput+" is: "+fact);
        } else {
            System.out.println("Invalid number");
        }
    }
}