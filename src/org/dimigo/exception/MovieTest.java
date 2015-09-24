package org.dimigo.exception;

/**
 * Created by gandd on 2015-09-23.
 */
public class MovieTest {
    public static void main(String[] args) {
        try {
            Movie[] movies = {
                    new Movie("앤트맨", 12), new Movie("사도", 12), new Movie("베테랑", 15)
            };
            int age = 13;
            for(Movie movie : movies) {
                buyTicket(movie, age);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void buyTicket(Movie movie, int age) throws Exception{
        if(age >= movie.getLimitAge()) {
            System.out.println(movie.getTitle() + " 영화 즐감하세요.");
        } else {
            throw new AgeCheckEception(movie);
        }
    }
}
