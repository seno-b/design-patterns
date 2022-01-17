package me.seno.designpatterns._03_abstract_factory.after;

import me.seno.designpatterns._02_factorymethod.after.Ship;

public class ShipInventory {
    public static void main(String[] args) {
        WhiteshipFactory whiteshipFactory = new WhiteshipFactory(new WhiteshipProPartsFactory());
        Ship ship = whiteshipFactory.createShip("나는야 돛단배!");
        System.out.println("ship = " + ship);
    }
}
