package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class CarTestWithMockito {

    private Engine mockEngine;
    private Car car;

    @Before
    public void setUp() {
        mockEngine = mock(Engine.class);
        car = new Car(mockEngine);
    }

    @Test
    public void shouldOnlyCallIgniteOnceWhenCallingStartTwice() {
        when(mockEngine.isRunning())
            .thenReturn(false, true);

        car.start();
        car.start();

        verify(mockEngine).ignite();
    }

    @Test
    public void newCarsShouldBeOff() {
        assertFalse(car.isOn());
    }

    @Test
    public void shouldBeOnAfterCallingStart() {
        when(mockEngine.isRunning())
            .thenReturn(false, true);

        car.start();

        assertTrue(car.isOn());
    }

    @Test
    public void shouldCallIgniteIfIsNotOnAndStartIsCalled() {
        boolean isOnBeforeStart = car.isOn();

        car.start();

        assertFalse(isOnBeforeStart);
        verify(mockEngine).ignite();
    }
}