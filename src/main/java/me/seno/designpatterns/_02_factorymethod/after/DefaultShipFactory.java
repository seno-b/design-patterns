package me.seno.designpatterns._02_factorymethod.after;

public abstract class DefaultShipFactory implements ShipFactory{

    @Override
    public void validate(String name, String email){
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    @Override
    public Ship orderShip(String name, String email) {
        this.validate(name, email);
        this.prepareFor(name);
        Ship ship = createShip(name);
        this.sendEmailTo(email, ship);
        return ship;
    }
}
