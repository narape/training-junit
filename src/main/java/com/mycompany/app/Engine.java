package com.mycompany.app;

public class Engine {
    private boolean running;

    public boolean isRunning() {
        return running;
    }

    public void ignite() {
        if (isRunning()) {
            System.out.println("RRRRRRR take it easy, I am running already");
        } else {
            running = true;
        }
    }
}
