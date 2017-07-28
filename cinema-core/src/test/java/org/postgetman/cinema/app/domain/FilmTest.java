package org.postgetman.cinema.app.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilmTest {

    private Film film;
    private LocalDate date;
    private LocalDateTime time;
    private Hall hall;

    @Before
    public void setup(){
        film = new Film("Saw");
        date = LocalDate.now();
        time = LocalDateTime.now();
    }

    @Test
    public void testAddValidFilmSession(){
        FilmSession filmSession = new FilmSession(film,date,time,hall);
        film.addFilmSession(filmSession);

        assertTrue(containsFilmSession(film,filmSession));
        assertEquals(film,filmSession.getFilm());
    }

    @Test
    public void testAddDuplicateFilmSessionFailure(){
        FilmSession filmSession = new FilmSession(film,date,time,hall);

        film.addFilmSession(filmSession);
        film.addFilmSession(filmSession);

        Assert.assertEquals(film.getFilmSessions().size(),1);

    }

    @Test
    public void testRemoveFilmSessionSucces(){
        FilmSession filmSession = new FilmSession(film,date,time,hall);

        film.addFilmSession(filmSession);
        film.removeFilmSession(filmSession);

        assertTrue(film.getFilmSessions().isEmpty());
    }

    private boolean containsFilmSession(Film film,FilmSession filmSession){
        return film.getFilmSessions().contains(filmSession);
    }




}
