package me.seno.designpatterns._02_factorymethod.after;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
