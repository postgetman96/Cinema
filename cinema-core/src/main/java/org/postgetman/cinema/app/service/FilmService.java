package org.postgetman.cinema.app.service;

import org.postgetman.cinema.app.domain.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {

    List<Film> findFilms();

    Film findFilmByName(final String name);

    void addFilm(Film film);

    void removeFilm(String name);
}
