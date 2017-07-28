package org.postgetman.cinema.app.service;

import org.postgetman.cinema.app.domain.FilmSession;

import java.util.List;

public interface FilmSessionService {

    List<FilmSession> findFilmSessions();

    void addFilmSession(FilmSession filmSession);

    void removeFilmSession(FilmSession filmSession);
}
