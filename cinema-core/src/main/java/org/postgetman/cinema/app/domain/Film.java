package org.postgetman.cinema.app.domain;

//import org.postgetman.cinema.app.domain.BaseEntity;

import org.postgetman.cinema.app.infra.util.CommonUtil;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Film extends BaseEntity {

    private String name;

    private String genre;

    private String producer;

    private int duration;

    private Set<FilmSession> filmSessions;


    public Film(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set<FilmSession> getFilmSessions() {
        return CommonUtil.getSafeSet(filmSessions);
    }

    public void setFilmSessions(Set<FilmSession> filmSessions) {
        this.filmSessions = filmSessions;
    }

    public void addFilmSession(FilmSession filmSession) {
        if (filmSessions == null) {
            filmSessions = new HashSet<>();
        }
        filmSessions.add(filmSession);
        filmSession.setFilm(this);

    }

    public void removeFilmSession(FilmSession filmSession) {
        Objects.requireNonNull(filmSession, "film session is not initialized");
        if (filmSessions == null) {
            return;
        }
        filmSessions.remove(filmSession);
    }

}
