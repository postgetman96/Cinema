package org.postgetman.cinema.app.service.impl;


import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.infra.util.CommonUtil;
import org.postgetman.cinema.app.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FilmServiceImpl implements FilmService {

    private List<Film> films;

    public FilmServiceImpl(){
        films = new ArrayList<>();
    }

    @Override
    public List<Film> findFilms(){
        return CommonUtil.getSafeList(films);
    }

    @Override
    public Film findFilmByName(final String name){
        return films.stream().filter((film) -> film.getName().equals(name)).findFirst().get();
    }

    @Override
    public void addFilm(Film film){
        if(!films.contains(film)) {
            films.add(film);
        }
    }

    @Override
    public void removeFilm(final String name){
        films.removeIf(film -> film.getName().equals(name));
    }
}
