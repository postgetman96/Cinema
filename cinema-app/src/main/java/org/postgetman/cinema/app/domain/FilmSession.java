package org.postgetman.cinema.app.domain;

import org.postgetman.cinema.app.domain.entity.base.BaseEntity;
import org.postgetman.cinema.app.infra.util.CommonUtil;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

public class FilmSession extends BaseEntity{

    private Film film;

    private Date date;

    private Set<Ticket> tickets;

    private Hall hall;

    private Time time;

    private int currentNumberOfTickets;


    public Film getFilm() { return film; }

    public void setFilm(Film film) { this.film = film; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public Set<Ticket> getTickets() { return CommonUtil.getSafeSet(tickets); }

    public void setTicket(Set<Ticket> ticket) { this.tickets = tickets; }

    public Hall getHall() { return hall; }

    public void setHall(Hall hall) { this.hall = hall; }

    public Time getTime() { return time; }

    public void setTime(Time time) { this.time = time; }

    public int getCurrentNumberOfTickets() { return currentNumberOfTickets; }

    public void setCurrentNumberOfTickets(int currentNumberOfTickets) { this.currentNumberOfTickets = currentNumberOfTickets; }


}
