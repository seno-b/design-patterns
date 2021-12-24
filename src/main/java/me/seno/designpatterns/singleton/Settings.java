package me.seno.designpatterns.singleton;

public class Settings {

    static Settings instance = new Settings();

    private Settings() {

    }

    public static Settings getInstance() {
        return instance;
    }
}
