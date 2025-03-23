package service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMyMovieApp {

    public static void main(String[] args) {
        BookMySys mbs = new BookMySys();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter City");
        String city = sc.next();

        mbs.displayTheater(city);

        System.out.println("Enter Theater ID and Movie ID for booking");
        int theaterId = sc.nextInt();
        int movieId = sc.nextInt();

        mbs.displayShows(movieId,theaterId);

        System.out.println("Enter show ID.");
        int showId = sc.nextInt();
//        System.out.println("Enter Seats.");
//        String s1 = sc.next();
//        String s2 = sc.next();
        List<String> ss = Arrays.asList("A3","A4");
        mbs.bookTicket(1,showId,ss);
    }
}
