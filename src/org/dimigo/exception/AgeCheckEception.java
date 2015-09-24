package org.dimigo.exception;

/**
 * Created by gandd on 2015-09-23.
 */
public class AgeCheckEception extends Exception {
    public AgeCheckEception() {
    }

    public AgeCheckEception(Movie movie) {
        super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "이상 관람가입니다.");
    }
}
