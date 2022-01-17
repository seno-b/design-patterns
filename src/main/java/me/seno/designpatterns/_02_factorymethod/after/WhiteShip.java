package me.seno.designpatterns._02_factorymethod.after;

public class WhiteShip extends Ship{
    public WhiteShip() {

    }

    public WhiteShip(String name) {
        setColor("white");
        setName(name);
        setLogo("🚢");
    }
}
