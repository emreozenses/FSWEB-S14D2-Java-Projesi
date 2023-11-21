package com.workintech.bedroom.main.model;

public class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
    public void create(){
        System.out.println("Wall direction: "+getDirection());
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
