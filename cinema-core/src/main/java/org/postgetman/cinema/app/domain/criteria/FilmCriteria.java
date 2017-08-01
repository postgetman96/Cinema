package org.postgetman.cinema.app.domain.criteria;

import java.util.Objects;

public class FilmCriteria {
    private String name;

    public static FilmCriteria byName(String name){
        return new FilmCriteria(name);
    }

    private FilmCriteria(final String name){
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }
}
