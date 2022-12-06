package com.example.menu.payload.request;

import javax.validation.constraints.NotBlank;

public class AssetsCreateRequest {
    @NotBlank
    private String localName;

    @NotBlank
    private String scientificName;

    @NotBlank
    private String location;

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
