package org.postgetman.cinema.app.domain;

import org.postgetman.cinema.app.domain.entity.base.BaseEntity;


public class Film extends BaseEntity{

    private String name;

    private String genre;

    private String producer;

    private int duration;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public String getProducer() { return producer; }

    public void setProducer(String producer) { this.producer = producer; }

    public int getDuration() { return duration; }

    public void setDuration(int duration) { this.duration = duration; }


}
