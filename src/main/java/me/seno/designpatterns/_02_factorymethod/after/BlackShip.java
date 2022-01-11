package me.seno.designpatterns._02_factorymethod.after;

public class BlackShip extends Ship{
    public BlackShip(String name) {
        setColor("block");
        setName(name);
        setLogo("⚓️");
    }
}
