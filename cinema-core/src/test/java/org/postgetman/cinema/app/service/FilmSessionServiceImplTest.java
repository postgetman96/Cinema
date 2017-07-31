package org.postgetman.cinema.app.service;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.domain.FilmSession;
import org.postgetman.cinema.app.domain.Hall;
import org.postgetman.cinema.app.service.impl.FilmSessionServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class FilmSessionServiceImplTest {
    private FilmSessionService filmSessionService;

    @Before
    public void setup(){
        filmSessionService = new FilmSessionServiceImpl();
    }

    @Test
    public void noDataReturnedArStart(){
        List<FilmSession>filmSessions = filmSessionService.findFilmSessions();
        assertTrue(filmSessions.isEmpty());
    }
    @Test
    public void addNewFilmSessionSuccess(){
        FilmSession filmSession = new FilmSession(new Film("Troya"),LocalDate.now(),
                LocalDateTime.now(), Hall.ORANGE);
        filmSessionService.addFilmSession(filmSession);

        List<FilmSession> filmSessions = filmSessionService.findFilmSessions();
        assertEquals(filmSessions.size(),1);
        assertEquals(filmSessions.get(0).getFilm().getName(),"Troya");
    }
    @Test
    public void testRemoveFilmSessionSuccess(){
        FilmSession filmSession = new FilmSession(new Film("Troya"),LocalDate.now(),
                LocalDateTime.now(), Hall.ORANGE);

        filmSessionService.removeFilmSession(filmSession);

        List<FilmSession> filmSessions = filmSessionService.findFilmSessions();
        assertEquals(filmSessions.size(),0);
    }


}
