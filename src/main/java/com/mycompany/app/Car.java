package com.mycompany.app;

public class Car {
    private Engine realEngine;

    public Car() {
        this.realEngine = new RealEngine();
    }

    //just for testing
    Car(Engine engine) {
        this.realEngine = engine;
    }

    public boolean isOn() {
        return realEngine.isRunning();
    }

    // Please test that calling starting twice will not call
    // realEngine.ignite twice, just once
    public void start() {
        if (!isOn()) {
            realEngine.ignite();
        }
    }
}
