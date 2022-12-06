package com.example.menu.model;

import javax.persistence.*;

@Entity
@Table(name = "assets")
public class Assets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "localName")
    private String localName;

    @Column(name = "scientificName")
    private String scientificName;

    @Column(name = "location")
    private String location;

    public Assets() {

    }

    public Assets(String localName, String scientificName, String location) {
        this.localName = localName;
        this.scientificName = scientificName;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
