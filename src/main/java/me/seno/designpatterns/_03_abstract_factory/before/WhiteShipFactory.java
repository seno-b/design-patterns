package me.seno.designpatterns._03_abstract_factory.before;

import me.seno.designpatterns._02_factorymethod.after.DefaultShipFactory;
import me.seno.designpatterns._02_factorymethod.after.Ship;
import me.seno.designpatterns._02_factorymethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
