package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void shouldOnlyCallIgniteOnceWhenCallingStartTwice() {
        FakeEngine spy = new FakeEngine();
        Car car = new Car(spy);

        car.start();
        car.start();

        assertEquals(1, spy.getNumCallsToIgnite());
    }
}