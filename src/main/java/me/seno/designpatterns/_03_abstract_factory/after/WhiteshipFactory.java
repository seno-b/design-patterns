package me.seno.designpatterns._03_abstract_factory.after;

import me.seno.designpatterns._02_factorymethod.after.DefaultShipFactory;
import me.seno.designpatterns._02_factorymethod.after.Ship;
import me.seno.designpatterns._02_factorymethod.after.WhiteShip;
import me.seno.designpatterns._03_abstract_factory.before.WhiteAnchor;
import me.seno.designpatterns._03_abstract_factory.before.WhiteWheel;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip(String name) {
        WhiteShip ship = new WhiteShip();
        ship.setName(name);
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
