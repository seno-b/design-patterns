package me.seno.designpatterns._03_abstract_factory.after;

import me.seno.designpatterns._03_abstract_factory.before.Anchor;
import me.seno.designpatterns._03_abstract_factory.before.Wheel;

public class WhiteshipProPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
