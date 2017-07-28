package org.postgetman.cinema.app.controller;


import org.postgetman.cinema.app.domain.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping(path="/films")
    public List<Film> findFilms() {
        return null;
    }

}
