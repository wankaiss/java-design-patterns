package com.gerald.proxy;

import com.gerald.proxy.utils.InMemoryAppender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link IvoryTower}.
 */
public class IvoryTowerTest {
  private InMemoryAppender appender;

  @Before
  public void setUp() {
    appender = new InMemoryAppender(IvoryTower.class);
  }

  @After
  public void tearDown() {
    appender.stop();
  }

  @Test
  public void testEnter() throws Exception {
    final Wizard[] wizards = new Wizard[]{
        new Wizard("Gandalf"),
        new Wizard("Dumbledore"),
        new Wizard("Oz"),
        new Wizard("Merlin")
    };

    IvoryTower ivoryTower = new IvoryTower();
    for (Wizard wizard : wizards) {
      ivoryTower.enter(wizard);
    }

    assertTrue(appender.logContains("Gandalf enters the tower."));
    assertTrue(appender.logContains("Dumbledore enters the tower."));
    assertTrue(appender.logContains("Oz enters the tower."));
    assertTrue(appender.logContains("Merlin enters the tower."));
    assertEquals(4, appender.getLogSize());
  }
}
