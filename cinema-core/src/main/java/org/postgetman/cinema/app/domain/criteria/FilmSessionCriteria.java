package org.postgetman.cinema.app.domain.criteria;

import org.postgetman.cinema.app.domain.Film;

import java.time.LocalDate;
import java.util.Objects;

public class FilmSessionCriteria {

    private Film film;

    private LocalDate date;

    public static FilmSessionCriteria byDate(LocalDate date){
        return new FilmSessionCriteria(date);
    }

    public FilmSessionCriteria(){

    }
    public FilmSessionCriteria(LocalDate date){
        this.date = Objects.requireNonNull(date);
    }
}
