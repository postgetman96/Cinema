package org.postgetman.cinema.app.service.impl;


import org.apache.logging.log4j.LogManager;
import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.infra.util.CommonUtil;
import org.postgetman.cinema.app.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.*;
import org.apache.logging.log4j.Logger;

@Service
public class FilmServiceImpl implements FilmService {
    private static final Logger LOGGER= LogManager.getLogger(FilmSessionServiceImpl.class);

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
