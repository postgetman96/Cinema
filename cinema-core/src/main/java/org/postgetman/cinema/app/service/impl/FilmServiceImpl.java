package org.postgetman.cinema.app.service.impl;


import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.infra.util.CommonUtil;
import org.postgetman.cinema.app.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
    public Film findFilmById(Long id){
        for(Film film : films){
            if(film.getId() == id){
                return film;
            }
        }

        return null;
    }

    @Override
    public void addFilm(Film film){
        if(!films.contains(film)){
            films.add(film);
        }
    }

    @Override
    public void removeFilm(String name){
        ListIterator<Film> iterator = films.listIterator();

        while(iterator.hasNext()){
            Film film = iterator.next();
                if(film.getName().equals(name)){
                    iterator.remove();
                }
        }
    }
}
