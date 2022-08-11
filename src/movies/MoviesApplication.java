package movies;

import util.Input;

import java.util.Arrays;


public class MoviesApplication {


    public static void movieApplication() {
        boolean itWorks = true;
        Movie[] moviesArray = MoviesArray.findAll();
        Input scanner = new Input();
        while (itWorks) {
            System.out.println("Choose a movie plz:)");
            System.out.println("0 - Quit");
            System.out.println("1 - See all movies");
            System.out.println("2 - See all horror movies");
            System.out.println("3 - See all sci-fi movies");
            System.out.println("4 - See all drama movies");
            System.out.println("5 - See all musical movies");
            int num = scanner.getSecretInt(0, 5);
            switch (num) {
                case (0):
                    System.out.println("Do you really want to do that? No takebacks...?");
                    scanner.delete();
                    boolean confirm = scanner.yesNo();
                    if (confirm) {
                        System.out.println("Fine, I get the memo.");
                        itWorks = false;
                        break;
                    } else {
                        System.out.println("Rebooting...");
                        break;
                    }
                case (1):
                    for (Movie movie : moviesArray) {
                        System.out.println(movie.getName() + " --- " + movie.getCategory());
                    }
                    break;
                case (2):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (3):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("sci-fi")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (4):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case (5):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("musical")) {
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    System.out.println("Loading...");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        movieApplication();
    }

}
