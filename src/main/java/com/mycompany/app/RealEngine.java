package com.mycompany.app;

public class RealEngine implements Engine {
    private boolean running;

    public RealEngine() {
        this(false);
    }

    //just for testing
    RealEngine(boolean running) {
        this.running = running;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void ignite() {
        if (isRunning()) {
            throw new IllegalStateException("RRRRRRR take it easy, I am running already");
        } else {
            running = true;
        }
    }
}
