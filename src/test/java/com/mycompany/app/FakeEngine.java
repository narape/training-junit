package com.mycompany.app;

public class FakeEngine implements Engine {
    private int numCalls;
    private boolean isRunning;


    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public void ignite() {
        this.isRunning = true;
        numCalls++;
    }

    public int getNumCallsToIgnite() {
        return this.numCalls;
    }
}
