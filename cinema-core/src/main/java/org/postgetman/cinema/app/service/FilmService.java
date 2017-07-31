package org.postgetman.cinema.app.service;

import org.postgetman.cinema.app.domain.Film;

import java.util.List;

public interface FilmService {

    List<Film> findFilms();

    Film findFilmById(Long id);

    void addFilm(Film film);

    void removeFilm(String name);
}
