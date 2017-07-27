package org.postgetman.cinema.app.domain;

import org.postgetman.cinema.app.domain.entity.base.BaseEntity;

public class Ticket extends BaseEntity{


    private int row;

    private int place;

    private int price;



    public int getRow() { return row; }

    public void setRow(int row) { this.row = row; }

    public int getPlace() { return place; }

    public void setPlace(int place) { this.place = place; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }


}
