package org.postgetman.cinema.app.controller;

import org.postgetman.cinema.app.domain.FilmSession;
import org.postgetman.cinema.app.dto.CreateFilmSessionDTO;
import org.postgetman.cinema.app.service.impl.FilmSessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/filmSessions")
public class FilmSessionController extends BaseController{

    @Autowired
    private FilmSessionServiceImpl service;


    @PostMapping
    public void addFilmsession(@RequestBody CreateFilmSessionDTO filmSessionDTO){

    }

    @DeleteMapping
    public void removeFilmSession(){

    }
}
