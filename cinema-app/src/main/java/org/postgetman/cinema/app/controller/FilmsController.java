package org.postgetman.cinema.app.controller;


import org.postgetman.cinema.app.domain.Film;
import org.postgetman.cinema.app.service.FilmService;
import org.postgetman.cinema.app.service.impl.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmsController {

    @Autowired
    public FilmService service;


    @GetMapping(path="/films")
    public List<Film> findFilms() {
        service.addFilm(new Film("HarryPotter"));
        service.addFilm(new Film("Resident Evil"));

        return service.findFilms();
    }

}
