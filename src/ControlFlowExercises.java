import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        //5 to 15
        int i = 5;
        while (i<=15){
            System.out.println("i is " + i);
            i++;
        }


//        0 to 100
        int a = 0;
        do {
            System.out.println(a);
            a += 2;
        } while (a <= 100);


//         100 to -10
        int b = 100;
        do {
            System.out.println(b);
            b -= 5;
        } while (b >= -10);


//         MCsquared
        long c = 2;
        do {
            System.out.println(c);
            c *= c;
        } while (c <= 1000000);


//        for loop
//         MCsquared for loop style
        for(long d = 2; d <= 10000000; d*=d) {
            System.out.println(d);
        }


//         FizzBuzz
        for (int e = 1; e <= 100; e++) {
            if (e % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (e % 5 == 0){
                System.out.println("Buzz");
            } else if (e % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(e);
            }
        }


        //table
        Scanner scanner = new Scanner(System.in);

//        boolean decision = true;
//
//        while(decision) {
//            System.out.println("Please enter a number:");
//            int userNum = scanner.nextInt();
//            String title = "Here is your table!\n\nnumber | squared | cubed\n------ | ------- | -----";
//            System.out.println(title);
//            for (long table = 1; table <= userNum; table++) {
//                long squared = table * table;
//                long cubed = table * table * table;
//                System.out.printf("%-6d | %-7d | %-5d %n", table, squared, cubed);
//            }
//            System.out.println("Would you like to enter another number? (y/n)");
//            String userChoice = scanner.next();
//            if(userChoice.equalsIgnoreCase("n")) {
//                decision = false;
//            }
//        }

        //grades

        boolean decision2 = true;

        while (decision2) {
            System.out.println("Please enter your grade (0 - 100)");
            int userGrade = scanner.nextInt();
            if (userGrade > 0 && userGrade <= 59) {
                System.out.println('F');
            } else if (userGrade > 59 && userGrade <= 66) {
                System.out.println('D');
            } else if (userGrade > 66 && userGrade <= 79) {
                System.out.println('C');
            } else if (userGrade > 79 && userGrade <= 87) {
                System.out.println('B');
            } else if (userGrade > 87 && userGrade <= 100) {
                System.out.println('A');
            }
            System.out.println("Do you want to enter another grade? (Y/N)");
            String userChoice = scanner.next();
            if(userChoice.equalsIgnoreCase("n")) {
                decision2 = false;
            }
        }


    }
}
