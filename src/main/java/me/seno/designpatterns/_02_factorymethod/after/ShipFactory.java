package me.seno.designpatterns._02_factorymethod.after;

public interface ShipFactory {
    Ship orderShip(String name, String email);

    Ship createShip(String name);

    void validate(String name, String email);

    void prepareFor(String name);

    void sendEmailTo(String email, Ship ship);
}
