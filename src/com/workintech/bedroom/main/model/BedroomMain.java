package com.workintech.bedroom.main.model;

public class BedroomMain {

    public static void main(String[] args) {

        Bedroom bedroom1 =  new Bedroom("Emre's Bedroom",new Wall("East"),new Wall("West"),new Wall("South"),new Wall("North"),new Ceiling(4,PaintColor.BROWN),new Bed("new prepared",2,1,1,1),new Lamp(LampType.HALOGEN,false,95),new Wardrobe(3,3,15.5),new Carpet(2,3,PaintColor.VIOLET));
        System.out.println(bedroom1);
        System.out.println(bedroom1.getBed());
        System.out.println(bedroom1.getCarpet());
        System.out.println(bedroom1.getCeiling());
        System.out.println(bedroom1.getLamp());
        System.out.println(bedroom1.getName());
        System.out.println(bedroom1.getWardrobe());
        System.out.println(bedroom1.getWall1());
        bedroom1.getBed().make();



    }
}
