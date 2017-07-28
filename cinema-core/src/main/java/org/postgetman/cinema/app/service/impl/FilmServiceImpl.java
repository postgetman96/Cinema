package org.postgetman.cinema.app.service.impl;


import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.infra.util.CommonUtil;
import org.postgetman.cinema.app.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public void addFilm(Film film){
        if(!films.contains(film)){
            films.add(film);
        }
    }

    @Override
    public void removeFilm(Film film){
        films.remove(film);
    }
}
