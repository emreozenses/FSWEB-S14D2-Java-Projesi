package com.workintech.bedroom.main.model;

public class Lamp {

    private LampType style;
    private Boolean battery;
    private int globalRating;


    public Lamp(LampType style, Boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LampType getStyle(){
        return style;
    }

    public Boolean getBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globalRating=" + globalRating +
                '}';
    }
}
