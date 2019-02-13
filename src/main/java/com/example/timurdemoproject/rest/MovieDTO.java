package com.example.timurdemoproject.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDTO {

    private String name;
    private String info;

    @JsonCreator
    public MovieDTO(@JsonProperty("name") String name,
                    @JsonProperty("info")String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
