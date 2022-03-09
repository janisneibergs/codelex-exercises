package io.codelex.classesandobjects.practice.exercises;

import java.util.Scanner;

class Movie {
    private static String title;
    private static String studio;
    private static String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        setRating("PG");
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public static String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void pg(){
        if(getRating().contains("PG")){
            System.out.println(getTitle()+" "+getStudio());
        }
    }
}
public class exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = "";
        String studio = "";
        String rating = "";

        String[][] film;
        film = new String[3][3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Movie title ");
            title = String.valueOf(scan.nextLine());

            System.out.print("Enter studio ");
            studio = String.valueOf(scan.nextLine());

            System.out.print("Enter rating ");
            rating = String.valueOf(scan.nextLine());
            film[i][0] = title;
            film[i][1] = studio;
            film[i][2] = rating;

        }

        for (int i = 0; i < 3; i++) {
            Movie movie = new Movie(film[i][0], film[i][1], film[i][2]);
            movie.pg();

        }

    }
}
