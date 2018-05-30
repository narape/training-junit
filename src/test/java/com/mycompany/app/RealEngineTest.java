package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class RealEngineTest {

  @Test
  public void byDefaultNewEnginesShouldBeNotRunning() {
    RealEngine engine = new RealEngine();

    assertFalse(engine.isRunning());
  }

  @Test
  public void shouldBeRunningAfterIgnite() {
    RealEngine engine = new RealEngine();
    boolean isRunningBeforeStart = engine.isRunning();

    engine.ignite();

    assertFalse(isRunningBeforeStart);
    assertTrue(engine.isRunning());
  }

  @Test(expected = IllegalStateException.class)
  public void shouldThrowExceptionIfEngineIsAlreadyRunningAndIgniteIsCalledAgain() {
    RealEngine engine = new RealEngine(true);

    engine.ignite();
  }
}