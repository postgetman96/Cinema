package org.postgetman.cinema.app.service.impl;

import org.postgetman.cinema.app.domain.FilmSession;
import org.postgetman.cinema.app.infra.util.CommonUtil;
import org.postgetman.cinema.app.service.FilmSessionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmSessionServiceImpl implements FilmSessionService{

    private List<FilmSession> filmSessions;

    public FilmSessionServiceImpl(){
        filmSessions = new ArrayList<>();
    }

    @Override
    public List<FilmSession> findFilmSessions(){
        return CommonUtil.getSafeList(filmSessions);
    }

    public void addFilmSession(FilmSession filmSession){
        if(!filmSessions.contains(filmSession)){
            filmSessions.add(filmSession);
        }
    }

    @Override
    public void removeFilmSession(FilmSession filmSession){
        if(filmSessions.contains(filmSession)){
            filmSessions.remove(filmSession);
        }
    }
}
