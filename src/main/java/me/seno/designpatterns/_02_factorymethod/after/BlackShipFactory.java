package me.seno.designpatterns._02_factorymethod.after;

public class BlackShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }

}
