package org.postgetman.cinema.app.domain;

import org.postgetman.cinema.app.domain.entity.base.BaseEntity;

import java.sql.Date;
import java.sql.Time;

public class FilmSession extends BaseEntity{

    private Date date;

    private Film film;

    private Hall hall;

    private Time time;

    private int currentNumberOfTickets;


    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }




}
