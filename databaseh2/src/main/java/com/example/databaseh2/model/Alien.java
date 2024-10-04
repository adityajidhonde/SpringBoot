package com.example.databaseh2.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    private String name;
    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + "]";
    }
    private String tech;
}
