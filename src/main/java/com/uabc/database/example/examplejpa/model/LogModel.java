package com.uabc.database.example.examplejpa.model;

import lombok.Data;

import java.util.Date;

@Data
public class LogModel {
    private int id;
    private String date;
    private String details;
    private String username;
    private String url;

    public LogModel(String date, String details, String username, String url) {
        this.date = date;
        this.details = details;
        this.username = username;
        this.url = url;
    }

    public LogModel() {

    }
}
