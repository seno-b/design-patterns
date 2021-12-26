package me.seno.designpatterns.singleton;

public class Settings {

    private Settings() {}

    static class SettingsHolder() {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
