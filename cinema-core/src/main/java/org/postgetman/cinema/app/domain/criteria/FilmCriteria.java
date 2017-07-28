package org.postgetman.cinema.app.domain.criteria;

import java.util.Objects;

public class FilmCriteria {
    private String name;
    private String genre;

    public static FilmCriteria byName(String name){
        return new FilmCriteria(name);
    }
    public static FilmCriteria byGenre(String genre){
        return new FilmCriteria(genre);
    }
    public FilmCriteria(){

    }

    private FilmCriteria(final String name){
        this.name = Objects.requireNonNull(name);
    }
}
