package java_one;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Hi there, this is Bob.\nType to talk to Bob\nIf you want to stop talking to Bob type 'stop'.");
        Scanner scanner = new Scanner(System.in);

        do{
            String userInput = scanner.nextLine();

            boolean isEmpty = userInput.isEmpty();
            boolean question = userInput.endsWith("?");
            boolean exclamation = userInput.endsWith("!");
            boolean stop = userInput.equals("stop");

            if (isEmpty) {
                System.out.println("...");
            } else if (question) {
                System.out.println("Yeah, why not.");
            } else if(exclamation){
                System.out.println("Stop yelling!");
            } else if (stop){
                break;
            } else {
                System.out.println("Hmm...");
            }

        } while(true);
    }

}