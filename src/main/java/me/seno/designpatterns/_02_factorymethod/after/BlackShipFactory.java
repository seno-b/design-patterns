package me.seno.designpatterns._02_factorymethod.after;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}
