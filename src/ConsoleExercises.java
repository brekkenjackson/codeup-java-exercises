import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately: ");
//        System.out.format("%.2f", pi);



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter 3 words: ");
//        String wordOne = s.next();
//        String wordTwo = s.next();
//        String wordThree = s.next();
//        System.out.printf("%s" + "%n" + "%s" + "%n" + "%s" + "%n", wordOne, wordTwo, wordThree);



//        Scanner newScan = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String niceSentence = newScan.nextLine();
//        System.out.println(niceSentence);


//        Scanner area = new Scanner(System.in);
//        System.out.print("Enter the height: ");
//        int myHeight = area.nextInt();
//        System.out.print("Enter the width: ");
//        int myWidth = area.nextInt();
//        System.out.printf("The area is: %s %n", myHeight * myWidth);


        Scanner perimeter = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int periHeight = perimeter.nextInt();
        System.out.print("Enter the width: ");
        int periWidth = perimeter.nextInt();
        System.out.printf("The perimeter is: %s %n", periHeight*2 + periWidth*2);

    }
}
