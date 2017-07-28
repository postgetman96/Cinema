package org.postgetman.cinema.app.domain;

import org.postgetman.cinema.app.infra.util.CommonUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public class FilmSession extends BaseEntity {

    private Film film;

    private LocalDate date;

    private Set<Ticket> tickets;

    private Hall hall;

    private LocalDateTime time;

    private int currentNumberOfTickets;


    public FilmSession(final Film film, LocalDate date, LocalDateTime time) {
        this.film = film;
        this.date = date;
        this.time = time;
    }


    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<Ticket> getTickets() {
        return CommonUtil.getSafeSet(tickets);
    }

    public void setTicket(Set<Ticket> ticket) {
        this.tickets = tickets;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getCurrentNumberOfTickets() {
        return currentNumberOfTickets;
    }

    public void setCurrentNumberOfTickets(int currentNumberOfTickets) {
        this.currentNumberOfTickets = currentNumberOfTickets;
    }


}
