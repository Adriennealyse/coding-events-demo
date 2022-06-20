package org.launchcode.codingevents.models;

import javax.persistence.Entity;

@Entity
public class Tag extends AbstractEntity {


    private String name;


    public Tag( String name) {
        this.name = name;
    }

    public Tag() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
