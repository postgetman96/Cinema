package org.postgetman.cinema.app.domain.entity;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.domain.FilmSession;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilmTest {

    private Film film;

    @Before
    public void setup(){
        film = new Film();
    }

    @Test
    public void testAddValidFilmSession(){
        FilmSession filmSession = new FilmSession();

        film.addFilmSession(filmSession);
        assertTrue(containsFilmSession(film, filmSession));
        assertEquals(film,filmSession.getFilm());

    }

    @Test(expected = NullPointerException.class)
    public void testAddNullFilmSessionFailure(){
        film.addFilmSession(null);
        assertTrue(false);
    }

    @Test
    public void testAddDuplicateFilmSessionFailure(){
        FilmSession filmSession = new FilmSession();

        film.addFilmSession(filmSession);
        film.addFilmSession(filmSession);

        assertEquals(film.getFilmSessions(),1);

    }

    private boolean containsFilmSession(Film film,FilmSession filmSession){
        return film.getFilmSessions().contains(filmSession);
    }




}
