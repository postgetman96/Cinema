package org.postgetman.cinema.app.service.impl;


import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.infra.util.CommonUtil;
import org.postgetman.cinema.app.service.FilmService;

import java.util.ArrayList;
import java.util.List;

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
    public void addFilm(Film film){
        if(!films.contains(film)){
            films.add(film);
        }
    }

    @Override
    public void removeFilm(Film film){
        if(films.contains(film)){
            films.remove(film);
        }
    }
}
