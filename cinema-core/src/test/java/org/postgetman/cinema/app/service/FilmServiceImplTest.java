package org.postgetman.cinema.app.service;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.service.impl.FilmServiceImpl;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilmServiceImplTest {

    private FilmService service;

    @Before
    public void setup(){
        service = new FilmServiceImpl();
    }

    @Test
    public void noDataReturnedAtStart(){
        List<Film> films = service.findFilms();
        assertTrue(films.isEmpty());
    }
    @Test
    public void testAddNewFilmSuccess(){
        Film film = new Film("Shutter Island");
        service.addFilm(film);

        List<Film> films = service.findFilms();
        assertEquals(films.size(),1);
        assertEquals(films.get(0).getName(),"Shutter Island");
    }
    @Test
    public void testRemoveFilmSuccess(){
        Film film = new Film("Lord of the rings");
        service.removeFilm(film.getName());

        List<Film> films = service.findFilms();
        assertEquals(films.size(),0);

    }
}
