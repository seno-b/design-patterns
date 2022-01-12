package me.seno.designpatterns._02_factorymethod.after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "wji", "keesun@mail.com");
        client.print(new BlackShipFactory(), "blackShipp", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
