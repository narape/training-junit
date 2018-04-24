package com.mycompany.app;

public class RealEngine implements Engine {
    private boolean running;

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void ignite() {
        if (isRunning()) {
            System.out.println("RRRRRRR take it easy, I am running already");
        } else {
            running = true;
        }
    }
}
