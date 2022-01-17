package me.seno.designpatterns._03_abstract_factory.after;

import me.seno.designpatterns._03_abstract_factory.before.Anchor;
import me.seno.designpatterns._03_abstract_factory.before.Wheel;
import me.seno.designpatterns._03_abstract_factory.before.WhiteAnchor;
import me.seno.designpatterns._03_abstract_factory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
