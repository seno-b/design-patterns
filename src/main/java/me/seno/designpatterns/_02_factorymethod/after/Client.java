package me.seno.designpatterns._02_factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("wji", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
