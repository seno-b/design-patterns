package me.seno.designpatterns._03_abstract_factory.after;

import me.seno.designpatterns._03_abstract_factory.before.Anchor;
import me.seno.designpatterns._03_abstract_factory.before.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
