package org.postgetman.cinema.app.controller;


import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.dto.CreateFilmDTO;
import org.postgetman.cinema.app.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/film")
public class FilmController {

    @Autowired
    public FilmService service;

    @GetMapping
    public List<Film> findFilms() {
        return service.findFilms();
    }

    @GetMapping("/{name}")
    public Film findFilmByName(@PathVariable final String name){
        return service.findFilmByName(name);
    }

    @PostMapping
    public void addFilm(@RequestBody CreateFilmDTO filmDTO){

        Film film = new Film(filmDTO.getName());
        film.setDuration(filmDTO.getDuration());
        film.setGenre(filmDTO.getGenre());
        film.setProducer(filmDTO.getProducer());

        service.addFilm(film);
    }

    @DeleteMapping
    public void removeFilm(final String filmName){
        service.removeFilm(filmName);
    }

}
