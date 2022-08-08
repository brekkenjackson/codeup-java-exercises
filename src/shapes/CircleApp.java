package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean makeMoreCircles = true;
        while (makeMoreCircles) {
            Input in = new Input();
            System.out.println("Let's make a circle.");
            Circle circle = new Circle(in.getDouble());
            System.out.printf("Your circle has a circumference of %f?%n", circle.getCircumference());
            System.out.printf("Your circle has an area of %f?%n", circle.getArea());
            System.out.println("Do you want to make more circles?");
            in.delete();
            makeMoreCircles = in.yesNo();
            if (makeMoreCircles) {
                System.out.println("Agreed, let's get it!");
            } else {
                System.out.println("Fine then, I didn't want to make anymore circles with you anyway >:0");
            }
        }
    }
}
