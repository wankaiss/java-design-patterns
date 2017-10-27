package com.gerald.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link Wizard}.
 */
public class WizardTest {
  @Test
  public void testToString() throws Exception {
    final String[] wizardName = {"Gandalf", "Dumbledore", "Oz", "Merlin"};

    for (String name : wizardName) {
      assertEquals(name, new Wizard(name).toString());
    }
  }
}
