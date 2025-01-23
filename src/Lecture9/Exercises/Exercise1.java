package Lecture9.Exercises;

import java.util.ArrayList;

public class Exercise1 {

    // program start/end
    public static void main(String[] args) {
        // prepare data for specific object creation
        ArrayList<String> starwars4Genres = new ArrayList<>();
        starwars4Genres.add("Action");
        starwars4Genres.add("Sci-fi");

        // create object movie like real objects in the world
        Movie batman = new Movie("Batman", "Action", 7.5);
        Movie ironman = new Movie("Ironman", "Action", 8.5);
        Movie barbie = new Movie("Barbie", "Kid", 6.75);
        Movie starwars1 = new Movie("Star Wars 1", "Sci-fi", 9.5);
        Movie hulk = new Movie("Hulk", "Drama", 5.5);
        Movie starwars4 = new Movie("Star Wars 4", starwars4Genres, 10);

        // modify real object by some attribute
        hulk.rating = 9.9;

        // Use method from object to do something
        System.out.println("-----------------");
        batman.printInfo();
        System.out.println("-----------------");
        ironman.printInfo();
        System.out.println("-----------------");
        hulk.printInfo();
        System.out.println("-----------------");
        starwars1.printInfo();
        System.out.println("-----------------");
        starwars4.printInfo();
        System.out.println("-----------------");
        barbie.printInfo();
        System.out.println("-----------------");
    }

}
