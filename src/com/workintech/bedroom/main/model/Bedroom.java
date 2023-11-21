package com.workintech.bedroom.main.model;

public class Bedroom extends Room{

    private String name;

    private Bed bed;

    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(wall1,wall2,wall3,wall4,ceiling,lamp);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }







    public Bed getBed() {
        return bed;
    }



    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void createBedroom(){

    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", wall1=" + super.getWall1() +
                ", wall2=" + super.getWall2() +
                ", wall3=" + super.getWall3() +
                ", wall4=" + super.getWall4() +
                ", ceiling=" + super.getCeiling() +
                ", bed=" + bed +
                ", lamp=" + super.getLamp() +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
