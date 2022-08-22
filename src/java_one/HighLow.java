package java_one;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessNum();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void guessNum() {
        int luckyNum = (int) (Math.random() * 100) + 1;
        int userInput;

        System.out.print("Pick a number between 1 and 100:");

        int guessAtt = 10;

        do {
            guessAtt -= 1;
            userInput = scanner.nextInt();

            if (userInput > luckyNum) {
                System.out.print("So close but it's a little lower! You have " + guessAtt + " attempts left.");
            } else if (userInput < luckyNum) {
                System.out.print("So close but it's a little higher! You have " + guessAtt + " attempts left.");
            } else {
                System.out.println("You guessed it! " + luckyNum + " was my lucky number ;)");
            }

        } while (guessAtt > 0);

        System.out.println("You ran out of guesses :( The lucky number was " + luckyNum);
    }
}