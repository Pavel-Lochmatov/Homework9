package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;

    public String getCoordinates() {
        return coordinates;
    }

    public String getType() {
        return type;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setType(String type) {
        this.type = type;
    }
}
