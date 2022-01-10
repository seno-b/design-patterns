package me.seno.designpatterns._01_singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {}

    static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /* 직렬화 & 역직렬화 대응 */
    protected Object readResolve() {
        return getInstance();
    }
}
