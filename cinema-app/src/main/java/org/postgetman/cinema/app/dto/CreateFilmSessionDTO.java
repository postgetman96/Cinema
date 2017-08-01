package org.postgetman.cinema.app.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreateFilmSessionDTO {

    private String filmName;

    private LocalDate date;

    private String hallName;

    private LocalDateTime time;

    public String getFilmName(){
        return filmName;
    }

    public void setFilm(String filmName){
        this.filmName = filmName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String getHallName() {
        return hallName;
    }

    public void setHall(String hallName){
        this.hallName = hallName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
