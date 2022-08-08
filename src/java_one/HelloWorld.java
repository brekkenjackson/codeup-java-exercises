package java_one;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");

        int myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);

        String myString = "Kenneth came back today:D";
        System.out.println(myString);

        System.out.println(myString + 'J');

        System.out.println(myString + 3.14159);

//        long myNumber = 123;
//        System.out.println(myNumber);

        float myNumber = (float) 3.14;
        System.out.println(myNumber);


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        //the first int = x variable is post-incremented, therefore it will not increment until after it is ran
        //the second int = x variable is pre-increment, therefore it will increment immediately while running

//        class = "class time"

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";\

        int xx = 4;
        xx += 5;
        System.out.println(xx);

        int yy = 3;
        int y = 4;
        y *= yy;
        System.out.println(y);

        int x1 = 10;
        int y1 = 2;
        x1 /= y1;
        y1 -= x1;
        System.out.println(x1);
        System.out.println(y1);

    }
}
