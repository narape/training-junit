package com.mycompany.app;

public class Car {
    private Engine engine = new Engine();

    public boolean isOn() {
        return engine.isRunning();
    }

    public void start() {
        if (!isOn()) {
            engine.ignite();
        }
    }
}
