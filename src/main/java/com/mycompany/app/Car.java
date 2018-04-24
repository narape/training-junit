package com.mycompany.app;

public class Car {
    private Engine engine = new Engine();

    public boolean isOn() {
        return engine.isRunning();
    }

    // Please test that calling starting twice will not call
    // engine.ignite twice, just once
    public void start() {
        if (!isOn()) {
            engine.ignite();
        }
    }
}
