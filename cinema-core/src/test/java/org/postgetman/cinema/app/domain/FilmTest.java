package org.postgetman.cinema.app.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.domain.FilmSession;
import org.postgetman.cinema.app.domain.Hall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilmTest {


    private Film film;
    /*
    @Before
    public void setup(){
        film = new Film("Saw");
    }
    */
    @Test
    public void testAddValidFilmSession(){


        /*FilmSession filmSession = new FilmSession(film);

        film.addFilmSession(Hall.BLUE);
        assertTrue(containsFilmSession(film, filmSession));
        Assert.assertEquals(film,filmSession.getFilm());
        */

    }
    /*
    @Test(expected = NullPointerException.class)
    public void testAddNullFilmSessionFailure(){
       /* film.addFilmSession(null);
        assertTrue(false);
        */

    /*
    @Test
    public void testAddDuplicateFilmSessionFailure(){
        FilmSession filmSession = new FilmSession(film);

        film.addFilmSession(Hall.BLUE);
        film.addFilmSession(Hall.BLUE);

        Assert.assertEquals(film.getFilmSessions(),1);

    }

    @Test
    public void testRemoveFilmSessionSucces(){
        FilmSession filmSession = new FilmSession(film);

        film.addFilmSession(Hall.ORANGE);
        film.removeFilmSession(filmSession);

        assertTrue(film.getFilmSessions().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNullFilmSessionFailure(){
        film.removeFilmSession(null);

        assertTrue(false);
    }

    private boolean containsFilmSession(Film film,FilmSession filmSession){
        return film.getFilmSessions().contains(filmSession);
    }
    */




}
