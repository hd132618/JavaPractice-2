package org.dimigo.exception;

/**
 * Created by gandd on 2015-09-23.
 */
public class Movie {
    private String title;
    private int limitAge;

    public Movie(String title, int limitAge) {
        this.limitAge = limitAge;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getLimitAge() {
        return limitAge;
    }
}
