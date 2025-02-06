package Lecture9.Exercises.DemoOnLecture;

import java.util.ArrayList;

public class Movie {
    private String title;
    private ArrayList<String> genre;
    double rating;

    public Movie(String title, ArrayList<String> genre, double movieRating){
        this.title = title;
        this.genre = genre;
        this.rating = movieRating;
    }

    public Movie(String title, String genre, double movieRating) {
        ArrayList<String> gerneList = new ArrayList<>();
        gerneList.add(genre);
        this.title = title;
        this.genre = gerneList;
        this.rating = movieRating;
    }

    public void printInfo(){
        System.out.println("The movie details are:");
        System.out.println("Movie title: " + this.title);
        System.out.println("Movie genre: " + this.genre);
        System.out.println("Movie rating: " + this.rating);
    }

    public ArrayList<String> addGenre(String gerne){
        if (this.genre.contains(gerne)){
            System.out.println("The " + gerne + " already exist.");
            return this.genre;
        }
        this.genre.add(gerne);
        return this.genre;
    }

    public ArrayList<String> addGenres(ArrayList<String> gernes){
        for(String gerne : gernes) {
            if (this.genre.contains(gerne)){
                continue;
            }
            this.genre.add(gerne);
        }

        return this.genre;
    }
}
